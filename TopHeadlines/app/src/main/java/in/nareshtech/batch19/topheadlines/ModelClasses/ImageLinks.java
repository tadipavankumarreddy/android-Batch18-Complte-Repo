
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class ImageLinks {

    private String smallThumbnail;
    private String thumbnail;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImageLinks() {
    }

    /**
     * 
     * @param thumbnail
     * @param smallThumbnail
     */
    public ImageLinks(String smallThumbnail, String thumbnail) {
        super();
        this.smallThumbnail = smallThumbnail;
        this.thumbnail = thumbnail;
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
