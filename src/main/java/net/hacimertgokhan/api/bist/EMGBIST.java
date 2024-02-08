package net.hacimertgokhan.api.bist;

import java.io.Serializable;

public interface EMGBIST {

    int getBIST100();
    int getBIST50();
    int getBIST30();
    Serializable getValueOfCompany(String code);
    Serializable getBISTCompanies();
}
