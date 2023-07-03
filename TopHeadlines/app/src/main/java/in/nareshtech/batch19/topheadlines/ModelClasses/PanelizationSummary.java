
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class PanelizationSummary {

    private Boolean containsEpubBubbles;
    private Boolean containsImageBubbles;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PanelizationSummary() {
    }

    /**
     * 
     * @param containsImageBubbles
     * @param containsEpubBubbles
     */
    public PanelizationSummary(Boolean containsEpubBubbles, Boolean containsImageBubbles) {
        super();
        this.containsEpubBubbles = containsEpubBubbles;
        this.containsImageBubbles = containsImageBubbles;
    }

    public Boolean getContainsEpubBubbles() {
        return containsEpubBubbles;
    }

    public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
        this.containsEpubBubbles = containsEpubBubbles;
    }

    public Boolean getContainsImageBubbles() {
        return containsImageBubbles;
    }

    public void setContainsImageBubbles(Boolean containsImageBubbles) {
        this.containsImageBubbles = containsImageBubbles;
    }

}
