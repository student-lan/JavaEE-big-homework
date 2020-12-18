package org.example;
//用户信息
public class Person {
    private Integer id;
    private String userName;
    private String password;
    private String nickName;
    private Integer userType;

    public Person() {
    }

    public Person(Integer id, String userName, String password, String nickName, Integer userType) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.userType = userType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userType=" + userType +
                '}';
    }
}
