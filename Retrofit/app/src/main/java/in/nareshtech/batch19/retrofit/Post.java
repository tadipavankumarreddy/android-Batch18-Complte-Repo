
package in.nareshtech.batch19.retrofit;

public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Post() {
    }

    /**
     * 
     * @param id
     * @param title
     * @param body
     * @param userId
     */
    public Post(int userId, int id, String title, String body) {
        super();
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
