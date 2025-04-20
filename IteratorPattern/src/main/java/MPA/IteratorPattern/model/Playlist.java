package MPA.IteratorPattern.model;

import MPA.IteratorPattern.iterator.ForwardSongIterator;
import MPA.IteratorPattern.iterator.ReverseSongIterator;
import MPA.IteratorPattern.iterator.SongIterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public SongIterator getForwardIterator() {
        return new ForwardSongIterator(songs);
    }

    public SongIterator getReverseIterator() {
        return new ReverseSongIterator(songs);
    }
}