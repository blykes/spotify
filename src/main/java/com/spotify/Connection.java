package com.spotify;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Connection {

    private static final String clientId = "679ad3c87a854512b70fdd0787dee7b9";
    private static final String secretId =  "d1630b7c55a74bf58873e4ad2ce64d49";
//    private static final String oauthId = "BQA_LHHu4a5-CzT2HMy3-0VdIgZfGsBVwLClNSe9x4ptU-6l5S94nTugf9ZracmyRzwLxLY3SS9YmjoEJwSUx0tsLAgoK4277XhWjQORF3m_OIfvYlnegEbzsiABJd4bPOOl7dj8kzEppRZAkdWpcXZdz0BQnA";

    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
            .setClientId(clientId)
            .setClientSecret(secretId).build();

    private static final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials()
            .build();



    public static SpotifyApi setClientCredentials_Sync(){
        try{
            final ClientCredentials clientCredentials = clientCredentialsRequest.execute();

            spotifyApi.setAccessToken(clientCredentials.getAccessToken()); //gets access token every time it connects

//            System.out.println("Expires In: " + clientCredentials.getExpiresIn());
////            System.out.println(spotifyApi.getAlbum("1HV4uCbhCicfl07dm2WvU0").build().execute().getArtists()[0].getName());
////            System.out.println(spotifyApi.getAlbum("1HV4uCbhCicfl07dm2WvU0").build().execute().getArtists()[1].getName());
//            System.out.println("\nLoop over Album Id getting artist names:");
//            for (int i = 0; i < spotifyApi.getAlbum("1HV4uCbhCicfl07dm2WvU0").build().execute().getArtists().length; i++){
//                System.out.println(spotifyApi.getAlbum("1HV4uCbhCicfl07dm2WvU0").build().execute().getArtists()[i].getName());
//            }
//
//
//            List<String> artists = new ArrayList<String>();
//            String artist = "Megadeth";
//            System.out.println("\nLoop over artist name: " + artist + "getting album IDs");
//            for (int i = 0; i < spotifyApi.searchArtists(artist).build().execute().getItems().length; i++) {
//                artists.add(spotifyApi.searchArtists(artist).build().execute().getItems()[i].getId());
//                System.out.println(artists.get(i));
//            }
//
//
//            System.out.println("\nLooping over artists");
//            for(int i =0; i < artists.size(); i++){
//                System.out.println(spotifyApi.getArtist(artists.get(i)).build().execute().getName());
//            }

            return spotifyApi;

        } catch (IOException | SpotifyWebApiException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
