package com.spotify;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepo extends MongoRepository<ArtistModel, String> {

    public ArtistModel findByArtistName(String artist);
    public ArtistModel saveArtist(ArtistModel artist);
    public ArtistModel getArtistModelByModelBy(ArtistModel artist);
    public ArtistModel deleteTrackModelByTrackName(ArtistModel artist);
    public ArtistModel updateTrack(ArtistModel artist);
}
