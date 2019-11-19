package com.spotify;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepo extends MongoRepository <TrackModel, String> {


    public TrackModel findByTrackName(String trackName);
}
