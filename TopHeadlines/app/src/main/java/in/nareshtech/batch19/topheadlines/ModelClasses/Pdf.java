
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class Pdf {

    private Boolean isAvailable;
    private String acsTokenLink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pdf() {
    }

    /**
     * 
     * @param isAvailable
     * @param acsTokenLink
     */
    public Pdf(Boolean isAvailable, String acsTokenLink) {
        super();
        this.isAvailable = isAvailable;
        this.acsTokenLink = acsTokenLink;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

}
