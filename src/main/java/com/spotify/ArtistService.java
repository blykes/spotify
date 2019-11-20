package com.spotify;

import com.wrapper.spotify.model_objects.specification.Artist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtistService {

    @Autowired
    private ArtistRepo artistRepo;


    public ArtistModel getArtistName (String artist) {
        System.out.println("This is getArtist Name");
        return artistRepo.findByArtistName(artist);
    }

    public String saveTrack(ArtistModel artist){
        System.out.println("This is saveTrack");
        artistRepo.save(artist);
        return "Saved artist " + artist;
    }

    public List<ArtistModel> getTrack(){
        System.out.println("This is get all artist");
        return artistRepo.findAll();
    }

    public String deleteArtist(ArtistModel artist){
        System.out.println("this is delete");
        artistRepo.deleteArtistModelByArtistName(artist);
        return "Track deleted" + artist;
    }

    public String updateArtist(ArtistModel artistModel){
        System.out.println("this is update");
        artistRepo.findByArtistName(artistModel.getArtist());
        artistRepo.save(artistModel);
        return "updated" + artistModel.getArtist() + "sucessfully";
    }
}
