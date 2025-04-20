package MPA.IteratorPattern.iterator;

import MPA.IteratorPattern.model.Song;

public interface SongIterator {
    boolean hasNext();
    Song next();
}