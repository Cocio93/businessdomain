package models;

public class Company {
    InfoEntity info;
    private String name, description, cvr;
    private int numEmpl, marketValue;
    
    public Company(String name, String description, String cvr, int numEmpl, int marketValue, InfoEntity info) {
        this.name = name;
        this.description = description;
        this.cvr = cvr;
        this.numEmpl = numEmpl;
        this.marketValue = marketValue;
        this.info = info;
    }
    
    public Company() {
        
    }
    public InfoEntity getInfo() {
        return info;
    }

    public void setInfo(InfoEntity info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }

}
