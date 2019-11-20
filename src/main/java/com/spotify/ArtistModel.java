package com.spotify;

import com.wrapper.spotify.model_objects.specification.Album;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Track;

import java.util.List;

public class ArtistModel {

    //Bigs A Artist is a Spotofy object while Artist model is MY model
    private String artist;
    private List <Track> songsList;
    private List <Album> albumList;

    public ArtistModel() {
        super();
    }

    public ArtistModel(String artist, List<Track> songsList, List<Album> albumList) {
        this.artist = artist;
        this.songsList = songsList;
        this.albumList = albumList;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Track> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Track> songsList) {
        this.songsList = songsList;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    @Override
    public String toString() {
        return "ArtistModel{" +
                "artist=" + artist +
                ", songsList=" + songsList.get(0).getName() + " Song Length= " + songsList.size() +
                ", albumList=" + albumList.get(0).getName() + " Album Length= " + albumList.size() +
                '}';
    }
}
