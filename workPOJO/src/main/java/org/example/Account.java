package org.example;
//账务页输出值
public class Account {
    private Integer contentId;
    private String title;
    private String icon;
    private Integer buyprice;
    private String time;


    public Account() {
    }

    public Account(Integer contentId, String title, String icon, Integer buyprice, String time) {
        this.contentId = contentId;
        this.title = title;
        this.icon = icon;
        this.buyprice = buyprice;
        this.time = time;

    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
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

    public Integer getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(Integer buyprice) {
        this.buyprice = buyprice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
