/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.model;

/**
 *
 * @author Manuel
 */
public class ActorDirector {
    private int id;
    private int personId;
    private int movieId;

    public ActorDirector(int personId, int movieId) {
        this.personId = personId;
        this.movieId = movieId;
    }

    public ActorDirector(int id, int personId, int movieId) {
        this(personId, movieId);
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getId() {
        return id;
    }
    
    
}
