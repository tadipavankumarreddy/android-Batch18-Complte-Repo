
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class ReadingModes {

    private Boolean text;
    private Boolean image;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReadingModes() {
    }

    /**
     * 
     * @param image
     * @param text
     */
    public ReadingModes(Boolean text, Boolean image) {
        super();
        this.text = text;
        this.image = image;
    }

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

}
