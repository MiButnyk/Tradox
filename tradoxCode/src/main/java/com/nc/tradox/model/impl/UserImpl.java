package com.nc.tradox.model.impl;

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

    public UserImpl() {

    }

    public UserImpl(Integer userId,
                    UserTypeEnum userType,
                    String firstName,
                    String lastName,
                    Date birthDate,
                    String email,
                    String phone,
                    Country location,
                    Passport passport,
                    Set<Route> transit,
                    Boolean verify) {
        this.userId = userId;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.passport = passport;
        this.transit = transit;
        this.verify = verify;
    }

    public UserImpl(ResultSet resultSet) throws SQLException {
        this.userId = resultSet.getInt("user_id");
        this.userType = UserTypeEnum.valueOf(resultSet.getString("user_type"));
        this.firstName = resultSet.getString("first_name");
        this.lastName = resultSet.getString("last_name");
        this.birthDate = resultSet.getDate("birth_date");
        this.email = resultSet.getString("email");
        this.phone = resultSet.getString("phone");
        this.location = new CountryImpl(resultSet.getString("USER.COUNTRY_ID"), null);
        Country citizenship = new CountryImpl(resultSet.getString("citizenship"), null);
        this.passport = new PassportImpl(resultSet.getString("passport_id"), citizenship);
        this.verify = resultSet.getInt("verify") == 1;
    }

    public UserImpl(ResultSet user, ResultSet passport) throws SQLException {
        this.userId = user.getInt("user_id");
        this.userType = UserTypeEnum.valueOf(user.getString("user_type"));
        this.firstName = user.getString("first_name");
        this.lastName = user.getString("last_name");
        this.birthDate = user.getDate("birth_date");
        this.email = user.getString("email");
        this.phone = user.getString("phone");
        this.location = new CountryImpl(user);
        this.passport = new PassportImpl(passport);
        this.verify = user.getInt("verify") == 1;
    }

    @Override
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public UserTypeEnum getUserType() {
        return userType;
    }

    @Override
    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Country getLocation() {
        return location == null ? new CountryImpl() : location;
    }

    public void setLocation(Country location) {
        this.location = location;
    }

    @Override
    public Passport getPassport() {
        return passport == null ? new PassportImpl() : passport;
    }

    @Override
    public String getPassportId() {
        return getPassport().getPassportId();
    }

    @Override
    public Country getCitizenshipCountry() {
        return getPassport().getCitizenshipCountry();
    }

    @Override
    public void setCitizenshipCountry(Country country) {
        getPassport().setCitizenshipCountry(country);
    }

    @Override
    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Set<Route> getTransit() {
        return transit;
    }

    public void setTransit(Set<Route> transit) {
        this.transit = transit;
    }

    public Boolean getVerify() {
        return verify;
    }

    public void setVerify(Boolean verify) {
        this.verify = verify;
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

    @Override
    public void setVerify() {
        this.verify = true;
    }

}