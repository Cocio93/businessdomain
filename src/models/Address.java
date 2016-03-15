package models;

public class Address {
    private CityInfo cityInfo;
    private String street;
    private int number;

    public Address(String street, CityInfo cityInfo, int number) {
        this.street = street;
        this.number = number;
        this.cityInfo = cityInfo;
    }
    
    public Address() {
        
    }
    
    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
