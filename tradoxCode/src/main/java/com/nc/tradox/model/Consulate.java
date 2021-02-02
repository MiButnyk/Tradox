package com.nc.tradox.model;

public interface Consulate extends Element {
    Integer getConsulateId();

    void setConsulateId(Integer consulateId);

    Country getCountry();

    void setCountry(Country country);

    String getCity();

    void setCity(String city);

    String getAddress();

    void setAddress(String address);

    String getPhoneNumber();

    void setPhoneNumber(String phoneNumber);

    Country getOwner();

    void setOwner(Country owner);
}