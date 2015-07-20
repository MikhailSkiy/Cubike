package com.example.mikhail.cubike.model;

/**
 * Created by Mikhail on 21.07.2015.
 */
public class Place {
    private String title_;
    private String description_;

    public Place(String title,String description){
        this.title_ = title;
        this.description_ = description;
    }

    public void setTitle(String title){
        this.title_ = title;
    }

    public String getTitle(){
        return this.title_;
    }

    public void setDescription(String description){
        this.description_ = description;
    }

    public String getDescription(){
        return this.description_;
    }
}
