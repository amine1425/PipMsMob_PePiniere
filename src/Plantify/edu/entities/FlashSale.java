package Plantify.edu.entities;

public class FlashSale {
    // attributes
    private int id;
    private String description;
    private String name;
    private String beginDate;
    private String endDate;
    private float price;
    private String image;

    // Constructor
    public FlashSale() {
    }
    public FlashSale(int id,String name , String description, String beginDate, String endDate, float price, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public float getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}