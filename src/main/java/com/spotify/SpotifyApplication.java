package com.spotify;

import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.requests.data.search.simplified.SearchArtistsRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
//@ComponentScan("com.spotify")
public class SpotifyApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpotifyApplication.class, args);
        try {
            System.out.println("Searching Megadeth in searchArtists from main:");
            Search.searchArtists("Megadeth");
            System.out.println("\nSearching Rust in Peace in searchTracks from main:");
            Search.searchTracks("Rust in Peace");
            Search.searchTest();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SpotifyWebApiException e) {
            e.printStackTrace();
        }
    }

}
