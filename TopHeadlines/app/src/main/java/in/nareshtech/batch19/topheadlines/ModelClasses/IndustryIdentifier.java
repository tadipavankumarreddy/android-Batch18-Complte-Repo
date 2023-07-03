
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class IndustryIdentifier {

    private String type;
    private String identifier;

    /**
     * No args constructor for use in serialization
     * 
     */
    public IndustryIdentifier() {
    }

    /**
     * 
     * @param identifier
     * @param type
     */
    public IndustryIdentifier(String type, String identifier) {
        super();
        this.type = type;
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
