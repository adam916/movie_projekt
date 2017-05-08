
import java.util.*;
import java.io.*;

public class Movies{
    private String movieTitle;
    private String movieActor1;
    private String movieActor2;
    private String movieActor3;
    private int movieYear;


   
    public Movies(String movieTitle, String movieActor1, String movieActor2, String movieActor3, int movieYear){
        
        this.movieTitle = movieTitle;
        this.movieActor1 = movieActor1;
        this.movieActor2 = movieActor2;
        this.movieActor3 = movieActor3;
        this.movieYear = movieYear;

    }
 



    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }

    public void setMovieActor(String movieActor1, String movieActor2, String movieActor3){
        this.movieActor1 = movieActor1;
        this.movieActor2 = movieActor2;
        this.movieActor3 = movieActor3;
    }


    public void setMovieYear(int movieYear){
        this.movieYear = movieYear;
    }


    public String getMovieTitle(){
        return movieTitle;
    }

    public String getMovieActor(){
        return movieActor1 + " " + movieActor2 + " " + movieActor3;
      
    }



    public int getMovieYear(){
        return movieYear;
    }



    public String toString()
    {
        return movieTitle + " " + movieActor1 + " " + movieActor2 + " " + movieActor3 + " " + movieYear;
    }
    


    }

