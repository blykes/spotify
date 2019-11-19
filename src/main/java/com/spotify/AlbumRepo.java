package com.spotify;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepo extends MongoRepository <AlbumModel, String>{


}
