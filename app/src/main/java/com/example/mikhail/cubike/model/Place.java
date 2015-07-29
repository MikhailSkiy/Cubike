package com.example.mikhail.cubike.model;

/**
 * Created by Mikhail on 21.07.2015.
 */
public class Place {
    private String title_;
    private String shortDescription_;
    private byte[] icon_;

    public Place(String title,String description){
        this.title_ = title;
        this.shortDescription_ = description;
    }

    public void setTitle(String title){
        this.title_ = title;
    }

    public String getTitle(){
        return this.title_;
    }

    public void setDescription(String description){
        this.shortDescription_ = description;
    }

    public String getDescription(){
        return this.shortDescription_;
    }

    public byte[] getIcon() {
        return icon_;
    }

    public void setIcon(byte[] icon) {
        this.icon_ = icon;
    }
}
