package MPA.IteratorPattern.controller;

import MPA.IteratorPattern.iterator.SongIterator;
import MPA.IteratorPattern.model.Playlist;
import MPA.IteratorPattern.model.Song;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    private final Playlist playlist;

    public PlaylistController() {
        this.playlist = new Playlist();
        // Adding default songs
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Levitating", "Dua Lipa"));
    }

    @GetMapping("/forward")
    public List<String> getSongsForward() {
        SongIterator iterator = playlist.getForwardIterator();
        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next().toString());
        }
        return result;
    }

    @GetMapping("/reverse")
    public List<String> getSongsReverse() {
        SongIterator iterator = playlist.getReverseIterator();
        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next().toString());
        }
        return result;
    }

    @PostMapping("/add")
    public String addSong(@RequestParam String title, @RequestParam String artist) {
        playlist.addSong(new Song(title, artist));
        return "Song added: " + title + " by " + artist;
    }
}
