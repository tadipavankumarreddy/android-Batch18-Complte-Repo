
package in.nareshtech.batch19.topheadlines.ModelClasses;

public class RetailPrice__1 {

    private Long amountInMicros;
    private String currencyCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RetailPrice__1() {
    }

    /**
     * 
     * @param amountInMicros
     * @param currencyCode
     */
    public RetailPrice__1(Long amountInMicros, String currencyCode) {
        super();
        this.amountInMicros = amountInMicros;
        this.currencyCode = currencyCode;
    }

    public Long getAmountInMicros() {
        return amountInMicros;
    }

    public void setAmountInMicros(Long amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

}
