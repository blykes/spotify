package com.spotify;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.special.SearchResult;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.Track;
import com.wrapper.spotify.requests.data.search.simplified.SearchArtistsRequest;
import com.wrapper.spotify.requests.data.search.simplified.SearchTracksRequest;

import java.io.IOException;

public class Search {
//    private static String accessToken = "BQDvWHRddxeYOs6hrB0B7X95E7SgQpViaZG0mLwRjjhXGOWWRJuUkTSP6_v56X96iVAfN_xBXEvBdlYEnEM";
//    private static String a = "Megadeth";
//    private static String t = "Rust in peace";

//    private static final SpotifyApi spotifyApi = new SpotifyApi.Builder()
//            .setAccessToken(accessToken).build();

    //Getting spotify connection
    private static final SpotifyApi spotifyApi = Connection.setClientCredentials_Sync();

    //Testing
//    private static final SearchArtistsRequest searchArtistsRequest = spotifyApi.searchArtists(a).build();
//    private static final SearchTracksRequest searchTracksRequest = spotifyApi.searchTracks(t).build();

    public static void searchArtists(String artist) throws IOException, SpotifyWebApiException {
        //final Paging<Artist> artistPaging = searchArtistsRequest.execute();
        //searchArtists searches artist by name
        Artist[] artists = spotifyApi.searchArtists(artist).build().execute().getItems();
        System.out.println("Total: " + artists.length);
        for (Artist a : artists){
            System.out.println(a.getName());
        }


//        System.out.println("Total: " + artistPaging.getTotal());

    }

    public static void searchTracks(String track) throws IOException, SpotifyWebApiException {
//        final Paging<Track> tracksPaging = searchTracksRequest.execute();
//        System.out.println("Length: " + tracksPaging.getTotal());
//        for(int i = 0; i < tracksPaging.getItems().length; i++){
//            System.out.println("Tracks: " + tracksPaging.getItems()[i].getName() + " by " + tracksPaging.getItems()[i].getArtists()[0].getName());
//
//        }
        //searchTracks gets the track names
        Track[] tracks = spotifyApi.searchTracks(track).build().execute().getItems();
        for (Track t : tracks){
            System.out.println("Tracks: " + t.getName() + " by " + t.getArtists()[0].getName());
        }

    }

    public static void searchTest() throws IOException, SpotifyWebApiException {
//        final Paging<Artist> artistPaging = searchArtistsRequest.execute();
//        final Paging<Track> trackPaging = searchTracksRequest.execute();
//        final Paging<Track> trackPaging1 = searchTracksRequest.execute();
//
//        System.out.println(" Stuff: " + trackPaging1.getItems()[0].getName());
//
//        System.out.println(artistPaging.getItems()[0].getName() + " " + trackPaging.getItems()[0].getName());

    }
}
