package com.example.lovepets;


import com.google.firebase.database.Exclude;

public class Upload{

    private String mName;
    private String mInfo;
    private String imageUrl;
    private String mKey;

    public Upload() {

    }

    public Upload(String imageUrl){
        this.imageUrl = imageUrl;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getInfo() {
        return mInfo;
    }

    public void setInfo(String info) {
        this.mInfo = info;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
@Exclude
    public String getmKey() {
        return mKey;
    }
@Exclude

    public  void setKey(String key) {
        mKey = key;
    }


}