package model;

public class Product {
    int id;
    String productName,category,productCity,productState,ownerName;

    public Product(int id, String productName, String category, String productCity, String productState, String ownerName) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.productCity = productCity;
        this.productState = productState;
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductCity() {
        return productCity;
    }

    public void setProductCity(String productCity) {
        this.productCity = productCity;
    }

    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", productCity='" + productCity + '\'' +
                ", productState='" + productState + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}