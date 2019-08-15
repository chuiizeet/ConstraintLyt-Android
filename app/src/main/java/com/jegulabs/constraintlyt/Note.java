package com.jegulabs.constraintlyt;

public class Note {

    private String title;
    private String container;
    private Boolean fav;
    private int color;


    public Note(String title, String container, Boolean fav, int color) {
        this.title = title;
        this.container = container;
        this.fav = fav;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public Boolean getFav() {
        return fav;
    }

    public void setFav(Boolean fav) {
        this.fav = fav;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
