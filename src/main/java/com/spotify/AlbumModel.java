package com.spotify;

import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Track;

import java.util.List;

public class AlbumModel {

    private String name;
    private List<Artist>artistList;
    private List<Track>trackList;

    public AlbumModel() {
        super();
    }

    public AlbumModel(String name, List<Artist> artistList, List<Track> trackList) {
        this.name = name;
        this.artistList = artistList;
        this.trackList = trackList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "AlbumModel{" +
                "name='" + name + '\'' +
                ", artistList=" + artistList +
                ", trackList=" + trackList +
                '}';
    }
}
