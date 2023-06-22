package in.vidhvan.freedomfightersofindia;

import java.io.Serializable;

// POJO - Plain Old Java Object
public class FreedomFighters implements Serializable {
    String name;
    String activeYears;
    String description;
    int photo;

    public FreedomFighters(String name, String activeYears, String description, int photo) {
        this.name = name;
        this.activeYears = activeYears;
        this.description = description;
        this.photo = photo;
    }

    public FreedomFighters() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActiveYears() {
        return activeYears;
    }

    public void setActiveYears(String activeYears) {
        this.activeYears = activeYears;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
