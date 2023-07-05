package by.itstep.swing.films;

import java.util.Date;

public class Film {
    private long uid;
    private double imdbRate;
    private String name;

    private Date releaseDate;
    private Actor[] actors;
    private String type;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public void setImdbRate(double imdbRate) {
        this.imdbRate = imdbRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Film(long uid, double imdbRate, String name, Date releaseDate, Actor[] actors, String type) {
        this.uid = uid;
        this.imdbRate = imdbRate;
        this.name = name;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.type = type;
    }

    public Film(){

    }

}
