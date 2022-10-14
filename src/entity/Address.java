package entity;

import enums.City;

public class Address {

    //----------------------Fields---------------------------------------------------------------------
    // 3 adet private instance degisken tanimlayin... String description - City city - String zipCode
    // City ayri bir sinif olarak tanimlanmistir, ilgili siniftaki odevlerinizi yapiniz...

    private String description;
    private City city;
    private String zipcode;


    //----------------------Constructor ---------------------------------------------------------------------
    // Tum degiskenler constructor ile initilize edilmelidir...

    public Address(String description, City city, String zipcode) {
        this.description = description;
        this.city = city;
        this.zipcode = zipcode;
    }

    //----------------------Getter and Setter ---------------------------------------------------------------------

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
