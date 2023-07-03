
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class RetailPrice {

    private Double amount;
    private String currencyCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RetailPrice() {
    }

    /**
     * 
     * @param amount
     * @param currencyCode
     */
    public RetailPrice(Double amount, String currencyCode) {
        super();
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
