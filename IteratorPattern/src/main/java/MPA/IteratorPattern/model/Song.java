package MPA.IteratorPattern.model;

import lombok.Getter;

@Getter
public class Song {
    private String title;
    private String artist;

    public Song() {
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}