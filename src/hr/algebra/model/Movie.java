/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Manuel
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {

    public static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    

    @XmlAttribute
    private int id;
    private String title;
    private String originalTitle;
    private String link;
    @XmlElementWrapper
    @XmlElement(name = "director")
    private List<Person> directors;
    private String description;
    private String picturePath;
    @XmlJavaTypeAdapter(PublishedDateAdapter.class)
    private LocalDateTime publisedDate;
    private int duration;
    private int year;
    private Genre genre;
    
    @XmlElementWrapper
    @XmlElement(name = "actor")
    private List<Person> actors;
    

    public Movie() {
    }
    
    public Movie(String title, String originalTitle, String link, String description, String picturePath, LocalDateTime publisedDate, int duration, int year, Genre genre) {
        this.title = title;
        this.originalTitle = originalTitle;
        this.link = link;
        this.description = description;
        this.picturePath = picturePath;
        this.publisedDate = publisedDate;
        this.duration = duration;
        this.year = year;
        this.genre = genre;
    }

    public Movie(String title, String originalTitle, String link, List<Person> directors, String description, String picturePath, LocalDateTime publisedDate, int duration, int year, Genre genre, List<Person> actors) {
        this.title = title;
        this.originalTitle = originalTitle;
        this.link = link;
        this.description = description;
        this.picturePath = picturePath;
        this.publisedDate = publisedDate;
        this.duration = duration;
        this.year = year;
        this.genre = genre;
        this.directors = directors;
        this.actors = actors;
    }

    public Movie(int id, String title, String originalTitle, String link, List<Person> directors, String description, String picturePath, LocalDateTime publisedDate, int duration, int year, Genre genre, List<Person> actors) {
        this(title, originalTitle, link, directors, description, picturePath, publisedDate, duration, year, genre, actors);
        this.id = id;  
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public LocalDateTime getPublisedDate() {
        return publisedDate;
    }

    public void setPublisedDate(LocalDateTime publisedDate) {
        this.publisedDate = publisedDate;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Person> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Person> directors) {
        this.directors = directors;
    }

    public List<Person> getActors() {
        return actors;
    }

    public void setActors(List<Person> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return String.format("%d ║ %s (%s) ║ %s ║ %s", id, title, originalTitle, publisedDate, link);
    }

}
