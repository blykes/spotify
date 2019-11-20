package com.spotify;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepo extends MongoRepository <TrackModel, String> {
    public TrackModel findByTrackName(String trackName);
    public TrackModel saveTrack(TrackModel trackName);
    public TrackModel getTrackModelBy(TrackModel trackName);
    public TrackModel deleteTrackModelByTrackName(TrackModel trackName);
    public TrackModel updateTrack(TrackModel trackName);


}
