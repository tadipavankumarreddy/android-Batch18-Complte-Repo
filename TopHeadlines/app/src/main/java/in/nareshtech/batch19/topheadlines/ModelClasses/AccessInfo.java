
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class AccessInfo {

    private String country;
    private String viewability;
    private Boolean embeddable;
    private Boolean publicDomain;
    private String textToSpeechPermission;
    private Epub epub;
    private Pdf pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private Boolean quoteSharingAllowed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccessInfo() {
    }

    /**
     * 
     * @param accessViewStatus
     * @param country
     * @param viewability
     * @param pdf
     * @param webReaderLink
     * @param epub
     * @param publicDomain
     * @param quoteSharingAllowed
     * @param embeddable
     * @param textToSpeechPermission
     */
    public AccessInfo(String country, String viewability, Boolean embeddable, Boolean publicDomain, String textToSpeechPermission, Epub epub, Pdf pdf, String webReaderLink, String accessViewStatus, Boolean quoteSharingAllowed) {
        super();
        this.country = country;
        this.viewability = viewability;
        this.embeddable = embeddable;
        this.publicDomain = publicDomain;
        this.textToSpeechPermission = textToSpeechPermission;
        this.epub = epub;
        this.pdf = pdf;
        this.webReaderLink = webReaderLink;
        this.accessViewStatus = accessViewStatus;
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getViewability() {
        return viewability;
    }

    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    public Boolean getEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    public Boolean getPublicDomain() {
        return publicDomain;
    }

    public void setPublicDomain(Boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    public String getTextToSpeechPermission() {
        return textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public Epub getEpub() {
        return epub;
    }

    public void setEpub(Epub epub) {
        this.epub = epub;
    }

    public Pdf getPdf() {
        return pdf;
    }

    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    public String getWebReaderLink() {
        return webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    public String getAccessViewStatus() {
        return accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    public Boolean getQuoteSharingAllowed() {
        return quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

}
