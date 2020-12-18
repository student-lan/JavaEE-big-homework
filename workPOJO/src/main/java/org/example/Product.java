package org.example;
//商品信息
public class Product {
    private Integer id;
    private float price;
    private String title;
    private String abstracts;
    private String text;
    private String icon;

    public Product() {
    }

    public Product(Integer id, float price, String title, String abstracts, String text,String icon) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.abstracts = abstracts;
        this.text = text;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
