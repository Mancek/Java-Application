/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.algebra.dal;

import hr.algebra.dal.sql.ActorRepository;
import hr.algebra.dal.sql.DirectorRepository;
import hr.algebra.dal.sql.GenreRepository;
import hr.algebra.dal.sql.MovieRepository;
import hr.algebra.dal.sql.PersonRepository;
import hr.algebra.dal.sql.UserRepository;

/**
 *
 * @author Manuel
 */
public class RepositoryFactory {

    private RepositoryFactory() {
    }
    
    public static Repository getMovieRepository() throws Exception {
        return new MovieRepository();
    }
    public static Repository getPersonRepository() throws Exception {
        return new PersonRepository();
    }
    public static Repository getGenreRepository() throws Exception {
        return new GenreRepository();
    }
    public static Repository getActorRepository() throws Exception {
        return new ActorRepository();
    }
    public static Repository getDirectorRepository() throws Exception {
        return new DirectorRepository();
    }
    public static Repository getUserRepository() throws Exception {
        return new UserRepository();
    }
    
}
