package Plantify.edu.entities;

public class Delivery {

    //`id`,  `status`,  LEFT(`adress`, 256),  `coordinate_x`,  `coordinate_y`,  `created_at`,  `validated_at`,  `order`
    private int id;
    private String status;
    private String adress;
    private String coordinate_x;
    private String coordinate_y;
    private String validated_at;
    private String order;

    public Delivery (int id, String status, String adress, String coordinate_x, String coordinate_y, String validated_at, String order) {
        this.id = id;
        this.status = status;
        this.adress = adress;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
        this.validated_at = validated_at;
        this.order = order;
    }

    public Delivery ( ) {
    }

    public Delivery (String status, String adress, String coordinate_x, String coordinate_y, String order) {
        this.status = status;
        this.adress = adress;
        this.coordinate_x = coordinate_x;
        this.coordinate_y = coordinate_y;
        this.order = order;
    }

    public int getId ( ) {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getStatus ( ) {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    public String getAdress ( ) {
        return adress;
    }

    public void setAdress (String adress) {
        this.adress = adress;
    }

    public String getCoordinate_x ( ) {
        return coordinate_x;
    }

    public void setCoordinate_x (String coordinate_x) {
        this.coordinate_x = coordinate_x;
    }

    public String getCoordinate_y ( ) {
        return coordinate_y;
    }

    public void setCoordinate_y (String coordinate_y) {
        this.coordinate_y = coordinate_y;
    }

    public String getValidated_at ( ) {
        return validated_at;
    }

    public void setValidated_at (String validated_at) {
        this.validated_at = validated_at;
    }

    public String getOrder ( ) {
        return order;
    }

    public void setOrder (String order) {
        this.order = order;
    }
}
