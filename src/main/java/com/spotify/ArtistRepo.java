package com.spotify;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepo extends MongoRepository<ArtistModel, String> {


}
