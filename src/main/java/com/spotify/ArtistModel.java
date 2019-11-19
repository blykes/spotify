package com.spotify;

import com.wrapper.spotify.model_objects.specification.Album;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Track;

import java.util.ArrayList;
import java.util.List;

public class ArtistModel {

    private Artist artist;
    private List <Track> songsList;
    private List <Album> albumList;

    public ArtistModel() {
        super();
    }

    public ArtistModel(Artist artist, List<Track> songsList, List<Album> albumList) {
        this.artist = artist;
        this.songsList = songsList;
        this.albumList = albumList;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
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
                "artist=" + artist.getName() +
                ", songsList=" + songsList.get(0).getName() + " Song Length= " + songsList.size() +
                ", albumList=" + albumList.get(0).getName() + " Album Length= " + albumList.size() +
                '}';
    }
}
