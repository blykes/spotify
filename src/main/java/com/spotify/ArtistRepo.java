package com.spotify;

import com.wrapper.spotify.model_objects.specification.Artist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepo extends MongoRepository<ArtistModel, String> {

    public ArtistModel findByArtistName(String artist);
    public ArtistModel saveArtist(ArtistModel artist);
    public ArtistModel getArtistModelBy(ArtistModel artist);
    public ArtistModel deleteArtistModelByArtistName(ArtistModel artist);
    public ArtistModel updateArtist(ArtistModel artist);


}
