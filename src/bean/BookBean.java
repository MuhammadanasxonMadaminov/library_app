package bean;

public class BookBean extends BaseIdBean {
    private String name;
    private String author;
    private Integer userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public  BookBean() {

    }

    public BookBean(String name, String author) {
        this.name = name;
        this.author = author;
    }


}
