//package com.spotify;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping
//public class SpotifyController {
//
//    //TODO: @Autowired database
//
//    @Autowired
//    Services spotifyService;
//
//    @GetMapping("/spotify/{song}")
//    public ResponseEntity<?> getSongInfo() {
//
//        SpotifyModel spotify = new SpotifyModel();
//
//        return new ResponseEntity(HttpStatus.OK);
//    }
//
//    @PostMapping("/spotify")
//    public ResponseEntity<?> addTrack(@RequestBody SpotifyModel song) {
//
//        SpotifyModel spotify = new SpotifyModel();
//
//        System.out.println("Artist name: " + song.getArtist());
//        System.out.println("Album name: " + song.getAlbum());
//        System.out.println("Track name: "+ song.getTrackName());
//
////
//        return new ResponseEntity(HttpStatus.OK);
//    }
//}
