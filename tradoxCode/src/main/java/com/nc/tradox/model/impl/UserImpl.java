package com.nc.tradox.model.impl;

import com.nc.tradox.dao.impl.TradoxDataAccessService;
import com.nc.tradox.model.Country;
import com.nc.tradox.model.Passport;
import com.nc.tradox.model.Route;
import com.nc.tradox.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Set;

public class UserImpl implements User {

    protected Integer userId;
    protected UserTypeEnum userType;
    protected String firstName;
    protected String lastName;
    protected Date birthDate;
    protected String email;
    protected String phone;
    protected Country location;
    protected Passport passport;
    protected Set<Route> transit;
    protected Boolean verify;

    public UserImpl(String firstName, String lastName, Date birthDate, String email,
                    String phone, Country location, Passport passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.passport = passport;
    }

    public UserImpl(Integer userId, UserTypeEnum userType, String firstName,
                    String lastName, Date birthDate, String email, String phone, Country location, Passport passport) {
        this.userId = userId;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.passport = passport;
    }

    public UserImpl(ResultSet user) {
        try {
            TradoxDataAccessService service = new TradoxDataAccessService();
            this.userId = user.getInt("user_id");
            this.userType = UserTypeEnum.valueOf(user.getString("user_type"));
            this.firstName = user.getString("first_name");
            this.lastName = user.getString("last_name");
            this.birthDate = user.getDate("birth_date");
            this.email = user.getString("email");
            this.phone = user.getString("phone");
            this.location = service.getCountryById(user.getString("country_id"));
            this.passport = service.getPassportById(user.getString("passport_id"));
            this.verify = user.getBoolean("verify");
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public Integer getUserId() {
        return this.userId;
    }

    @Override
    public UserTypeEnum getUserType() {
        return this.userType;
    }

    @Override
    public Boolean setUserType(UserTypeEnum userTypeEnum) {
        //возможна какая-то логика
        this.userType = userTypeEnum;
        return true;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public Boolean setFirstName(String firstName) {
        this.firstName = firstName;
        return true;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public Boolean setLastName(String lastName) {
        this.lastName = lastName;
        return true;
    }

    @Override
    public Date getBirthDate() {
        return this.birthDate;
    }

    @Override
    public Boolean setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return true;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public Boolean setEmail(String email) {
        this.email = email;
        return true;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    @Override
    public Boolean setPhone(String phone) {
        this.phone = phone;
        return true;
    }

    @Override
    public Country getLocation() {
        return this.location;
    }

    @Override
    public Boolean setLocation(Country location) {
        this.location = location;
        return true;
    }

    @Override
    public Passport getPassport() {
        return this.passport;
    }

    @Override
    public Boolean setPassport(Passport passport) {
        this.passport = passport;
        return true;
    }

    @Override
    public Set<Route> getHistory() {
        return this.transit;
    }

    @Override
    public Boolean addToHistory(Route route) {
        return this.transit.add(route);
    }

    @Override
    public Boolean removeFromHistory(Route route) {
        return this.transit.remove(route);
    }

    @Override
    public Boolean isVerified() {
        return this.verify;
    }

}
