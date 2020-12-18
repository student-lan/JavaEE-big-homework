package org.example;
//查看页输出值
public class Produce {
    private int id;
    private String title;
    private String abstracts;
    private String text;
    private String icon;
    private int price;
    private int buyPrice;
    private int isBuy;    //买
    private int isSell;    //卖

    public Produce() {
    }

    public Produce(int id, String title, String abstracts, String text, String icon, int price, int buyPrice, int isBuy, int isSell) {
        this.id = id;
        this.title = title;
        this.abstracts = abstracts;
        this.text = text;
        this.icon = icon;
        this.price = price;
        this.buyPrice = buyPrice;
        this.isBuy = isBuy;
        this.isSell = isSell;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(int isBuy) {
        this.isBuy = isBuy;
    }

    public int getIsSell() {
        return isSell;
    }

    public void setIsSell(int isSell) {
        this.isSell = isSell;
    }
}
