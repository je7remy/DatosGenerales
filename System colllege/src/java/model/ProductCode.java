package model;
// Generated 22-feb-2020 15:48:05 by Hibernate Tools 4.3.1



/**
 * ProductCode generated by hbm2java
 */
public class ProductCode  implements java.io.Serializable {


     private String prodCode;
     private char discountCode;
     private String description;

    public ProductCode() {
    }

	
    public ProductCode(String prodCode, char discountCode) {
        this.prodCode = prodCode;
        this.discountCode = discountCode;
    }
    public ProductCode(String prodCode, char discountCode, String description) {
       this.prodCode = prodCode;
       this.discountCode = discountCode;
       this.description = description;
    }
   
    public String getProdCode() {
        return this.prodCode;
    }
    
    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }
    public char getDiscountCode() {
        return this.discountCode;
    }
    
    public void setDiscountCode(char discountCode) {
        this.discountCode = discountCode;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


