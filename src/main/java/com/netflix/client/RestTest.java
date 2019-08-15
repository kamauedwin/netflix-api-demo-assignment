package com.netflix.client;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class RestTest implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate  = new RestTemplate();
        ResponseEntity<List<Movies>> response = restTemplate.exchange(
                "http://10.51.40.65:8080/movies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movies>>(){});
        List<Movies> movie= response.getBody();

        for(Movies movies : movie){
            System.out.println(movie.toString());
        }






///ADDING A USER....




        System.out.println("Users added...................................");

        Users user1 = new Users( 78247014, "John");
        Users addnewuser = restTemplate.postForObject(
                "http://10.51.48.130:8080/users",
                user1, Users.class);
        System.out.println(addnewuser.toString());



        ///ADDING A MOVIE


        Movies movies1 = new Movies("Shaft", "Action");
        Movies movies2 = new Movies("Jumanji", "Comedy");
        Movies movie3 = new Movies("Perfect data", "Romance");
        Movies addnewmovies = restTemplate.postForObject(
                "http://10.51.48.130:8080/movies",
                movies1,Movies.class,
                movies2, Movies.class,
                movie3,Movies.class);

        System.out.println(addnewmovies.toString());

        System.out.println("you have successfully added a movie");


        //ORIGINAL OR SUGGESTED

        Type type = new Type("original", (List<Movies>) movies1);
        Type type2 = new Type("Suggested", (List<Movies>)movies2);
        Type type3= new Type("original",(List<Movies>)movie3);

        Type addnewtype = restTemplate.postForObject(
                "http://10.51.48.130:8080/type",
                type, Type.class,
                type2, Type.class,
                type3, Type.class);
        System.out.println(addnewtype.toString());

        System.out.println(".........................................movietype");














    }



}


        /*movies movies= new movies(2,"Endgame","yes","blackish",2);

        movies addnewmovie = restTemplate.postForObject("http://10.51.31.63:8080/movies",
                movies, movies.class);
        System.out.println(addnewmovie.toString());



    }
}*/
