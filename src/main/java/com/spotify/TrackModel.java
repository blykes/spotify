package com.spotify;

import org.springframework.context.annotation.Bean;


public class TrackModel {

    private String artist;
    private String trackName;
    private String album;

    public TrackModel(){
        super();
    }

    public TrackModel(String artist, String trackName, String album){
        super();
        this.album = album;
        this.artist = artist;
        this.trackName = trackName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "TrackModel{" +
                "artist='" + artist + '\'' +
                ", trackName='" + trackName + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
