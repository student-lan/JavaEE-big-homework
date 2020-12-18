package org.example;
//展示页输出值
public class Content {
    private int id;
    private String title;
    private String icon;
    private String price;

    public Content() {
    }

    public Content(int id, String title, String icon, String price) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        this.price = price;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
