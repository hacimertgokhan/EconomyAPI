package net.hacimertgokhan.api;
import com.google.gson.*;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import net.hacimertgokhan.api.bist.EMGBIST;

import java.io.Serializable;
import java.util.HashMap;

public class EconomgAPI implements EMGBIST {
    private HashMap<String, String> bist = new HashMap<String, String>();
    private Object object;
    private JsonObject jsonObject;
    private JsonArray resultObject;
    private int bist100 = 0;
    private int bist50 = 0;
    private int bist30 = 0;

    public EconomgAPI(String collect_api) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.collectapi.com/economy/hisseSenedi")
                    .header("content-type", "application/json")
                    .header("authorization", "apikey " + collect_api)
                    .asString();
            object = new JsonParser().parse(response.getBody());
            jsonObject = (JsonObject) object;
            resultObject = jsonObject.get("result").getAsJsonArray();
            // Do not change '546' !
            for(int a=0; a<546; a++) {
                if(resultObject.get(a) != null) {
                    JsonObject test = resultObject.get(a).getAsJsonObject();
                    if (test != null) {
                        bist.put(test.get("code").getAsString(), test.get("lastprice").getAsString());
                    }
                }
                if(a == 545) {
                    System.out.println(String.format("[Economg]: Bütün BIST Hisseleri yüklendi. (%s)", bist.size()));
                }
            }
        } catch (Exception e) {
            System.out.println(String.format("[Economg]: BIST Hisseleri yüklenemedi. (%s)", 0));
            e.printStackTrace();
        }
    }

    /**
     * @return 
     */
    @Override
    public int getBIST100() {
        return bist100;
    }

    /**
     * @return 
     */
    @Override
    public int getBIST50() {
        return bist50;
    }

    /**
     * @return 
     */
    @Override
    public int getBIST30() {
        return bist30;
    }

    /**
     * @return
     */
    @Override
    public Serializable getValueOfCompany(String code) {
        if(bist.containsKey(code)) {
            return bist.get(code);
        }
        return 0;
    }

    /**
     * @return
     */
    @Override
    public Serializable getBISTCompanies() {
        return bist.toString();
    }
}
