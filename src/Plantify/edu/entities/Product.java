package Plantify.edu.entities;

public class Product {

    //http://127.0.0.1:8000/api/products
    private int id;
    private String name;
    private String description;
    private String category;
    private String image;
    private String price;
    private String discountEndDate;
    private int status;
    private String order_lines;
    private String flash_sales;
    private String seller;
    private String created_at;
    private String discount_end_date;
    private String discount_begin_date;
  /*  "id": 1,
        "name": null,
        "description": "this is",
        "image": null,
        "status": null,
        "price": null,
        "discount_end_date": "2019-07-17T18:43:11+00:00",
        "discount_begin_date": "2019-07-17T18:43:06+00:00",
        "created_at": "2019-07-17T18:43:09+00:00",
        "discount": null,
        "order_lines": [],
        "seller": null,
        "category": null,
        "flash_sales": []*/

    public Product (int id, String name, String description, String category, String image, String price, String discountEndDate, int status, String order_lines, String flash_sales, String seller, String created_at, String discount_end_date, String discount_begin_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.price = price;
        this.discountEndDate = discountEndDate;
        this.status = status;
        this.order_lines = order_lines;
        this.flash_sales = flash_sales;
        this.seller = seller;
        this.created_at = created_at;
        this.discount_end_date = discount_end_date;
        this.discount_begin_date = discount_begin_date;
    }

    public String getSeller ( ) {
        return seller;
    }

    public void setSeller (String seller) {
        this.seller = seller;
    }

    public Product() {
    }

    public Product(int id, String name, String description, String category, String image, String price, String discountEndDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.price = price;
        this.discountEndDate = discountEndDate;
    }

    public Product(int id, String name, String description, String category, String image, String price, String discountEndDate, int status, String order_lines, String flash_sales, String created_at, String discount_end_date, String discount_begin_date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.price = price;
        this.discountEndDate = discountEndDate;
        this.status = status;
        this.order_lines = order_lines;
        this.flash_sales = flash_sales;
        this.created_at = created_at;
        this.discount_end_date = discount_end_date;
        this.discount_begin_date = discount_begin_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrder_lines() {
        return order_lines;
    }

    public void setOrder_lines(String order_lines) {
        this.order_lines = order_lines;
    }

    public String getFlash_sales() {
        return flash_sales;
    }

    public void setFlash_sales(String flash_sales) {
        this.flash_sales = flash_sales;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDiscount_end_date() {
        return discount_end_date;
    }

    public void setDiscount_end_date(String discount_end_date) {
        this.discount_end_date = discount_end_date;
    }

    public String getDiscount_begin_date() {
        return discount_begin_date;
    }

    public void setDiscount_begin_date(String discount_begin_date) {
        this.discount_begin_date = discount_begin_date;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountEndDate() {
        return discountEndDate;
    }

    public void setDiscountEndDate(String discountEndDate) {
        this.discountEndDate = discountEndDate;
    }
}
