package com.christian.bean;

/**
 * author：Administrator on 2017/6/4 01:15
 * email：lanhuaguizha@gmail.com
 */
public class Home {

    public Home(String title, String time, String author) {
        this.title = title;
        this.time = time;
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String image;
    private String title;
    private String time;
    private String author;
}
