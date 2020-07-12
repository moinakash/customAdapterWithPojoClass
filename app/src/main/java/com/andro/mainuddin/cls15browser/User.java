package com.andro.mainuddin.cls15browser;

public class User {

    int imgRes;
    String name;
    String url;

    public User(String name, String url,int imgRes) {
        this.imgRes = imgRes;
        this.name = name;
        this.url = url;
    }


    public int getImgRes() {
        return imgRes;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
