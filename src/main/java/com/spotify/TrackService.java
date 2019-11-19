package com.spotify;

import org.springframework.beans.factory.annotation.Autowired;

public class TrackService {

    @Autowired
    private TrackRepo trackRepo;

    public TrackModel getTrackName (String trackName) {
        return trackRepo.findByTrackName(trackName);
    }

}
