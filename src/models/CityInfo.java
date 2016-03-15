
package models;

public class CityInfo {
    String city;
    int zip;
    
    public CityInfo(String city, int zip) {
        this.city = city;
        this.zip = zip;
    }

    public CityInfo() {
        
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    
}
