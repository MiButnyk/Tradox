package com.nc.tradox.model;

public interface Country {
    String getFullName();

    void setFullName(String fullName);

    String getShortName();

    void setShortName(String shortName);

    String getCurrency();

    void setCurrency(String currency);

    double getMediumBill();

    void setMediumBill(double mediumBill);

    int getTourismCount();

    void setTourismCount(int tourismCount);

    Covid getCovidInfo();

    void setCovidInfo(Covid covidInfo);
}
