package com.example.dreamytravelertwo;

public class MenuCity {
    private String name;
    private String location;
    private int photo;
    private String climateConditions;
    private String attractions;

    public MenuCity(String name, String location, int photo, String climateConditions, String attractions) {
        this.name = name;
        this.location = location;
        this.photo = photo;
        this.climateConditions = climateConditions;
        this.attractions = attractions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getClimateConditions() {
        return climateConditions;
    }

    public void setClimateConditions(String climateConditions) {
        this.climateConditions = climateConditions;
    }

    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }
}
