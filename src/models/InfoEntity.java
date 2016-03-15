package models;

import java.util.ArrayList;

public class InfoEntity {
    private int id;
    private String email;
    private ArrayList<Phone> phones = new ArrayList<>();
    private CityInfo cityInfo;
    private Address adress;
    
    public InfoEntity(int id, String email, Phone phone, CityInfo cityInfo, Address adress) {
        this.id = id;
        this.email = email;
        phones.add(phone);
        this.cityInfo = cityInfo;
        this.adress = adress;
    }

    public InfoEntity() {
        
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void addPhone(int number, String type) {
        Phone p = new Phone(number, type);
        phones.add(p);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }


}
