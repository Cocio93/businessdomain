package models;

public class Hobby {
    private String name, description;
    
    public Hobby(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Hobby() {
        
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
}
