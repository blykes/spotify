package com.spotify;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrackService {

    @Autowired
    private TrackRepo trackRepo;

    public TrackModel getTrackName (String trackName) {
        System.out.println("This is getTrackName");
        return trackRepo.findByTrackName(trackName);
    }

    public String saveTrack(TrackModel trackName){
        System.out.println("This is saveTrack");
        trackRepo.save(trackName);
        return "Saved track " + trackName;
    }

    public List <TrackModel> getTrack(){
        System.out.println("This is get all");
        return trackRepo.findAll();
    }

    public String deleteTrack(String trackName){
        System.out.println("this is delete");
        trackRepo.deleteById(trackName);
        return "Track deleted" + trackName;
    }

    public String updateTrack(TrackModel trackModel){
        System.out.println("this is update");
        trackRepo.findByTrackName(trackModel.getTrackName());
        trackRepo.save(trackModel);
        return "updated" + trackModel.getTrackName() + "sucessfully";
    }

}
