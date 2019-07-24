package Plantify.edu.entities;

public class Post {

    private String id;
    private String user;
    private String content;
    private String image;
    private String createdAt;
    private String updatedAt;

    public Post ( ) {
    }

    public Post (String id, String user, String content, String image, String createdAt, String updatedAt) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Post (String user, String content, String image, String createdAt) {
        this.user = user;
        this.content = content;
        this.image = image;
        this.createdAt = createdAt;
    }

    public String getId ( ) {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getUser ( ) {
        return user;
    }

    public void setUser (String user) {
        this.user = user;
    }

    public String getContent ( ) {
        return content;
    }

    public void setContent (String content) {
        this.content = content;
    }

    public String getImage ( ) {
        return image;
    }

    public void setImage (String image) {
        this.image = image;
    }

    public String getCreatedAt ( ) {
        return createdAt;
    }

    public void setCreatedAt (String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt ( ) {
        return updatedAt;
    }

    public void setUpdatedAt (String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString ( ) {
        return "Post{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
