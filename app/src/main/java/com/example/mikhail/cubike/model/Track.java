package com.example.mikhail.cubike.model;

/**
 * Created by Mikhail on 19.07.2015.
 */
public class Track {
    private String title;
    private String description;
    private int duration;
    private int length;
    private int rating;

    public Track(String title, String description, int duration, int length) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
