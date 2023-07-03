
package in.nareshtech.batch19.topheadlines.ModelClasses;

import java.util.List;


public class SaleInfo {

    private String country;
    private String saleability;
    private Boolean isEbook;
    private ListPrice listPrice;
    private RetailPrice retailPrice;
    private String buyLink;
    private List<Offer> offers;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SaleInfo() {
    }

    /**
     * 
     * @param offers
     * @param country
     * @param isEbook
     * @param saleability
     * @param buyLink
     * @param retailPrice
     * @param listPrice
     */
    public SaleInfo(String country, String saleability, Boolean isEbook, ListPrice listPrice, RetailPrice retailPrice, String buyLink, List<Offer> offers) {
        super();
        this.country = country;
        this.saleability = saleability;
        this.isEbook = isEbook;
        this.listPrice = listPrice;
        this.retailPrice = retailPrice;
        this.buyLink = buyLink;
        this.offers = offers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public ListPrice getListPrice() {
        return listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public RetailPrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getBuyLink() {
        return buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

}
