package Plantify;


public class Order {


        // attributes
        private int id;
        private String createdAt;
        private String validatedAt;
        private Float totalPrice;
        private String note;

    public Order() {
    }

    public Order(int id, String createdAt, String validatedAt, Float totalPrice, String note) {
        this.id = id;
        this.createdAt = createdAt;
        this.validatedAt = validatedAt;
        this.totalPrice = totalPrice;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getValidatedAt() {
        return validatedAt;
    }

    public void setValidatedAt(String validatedAt) {
        this.validatedAt = validatedAt;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
