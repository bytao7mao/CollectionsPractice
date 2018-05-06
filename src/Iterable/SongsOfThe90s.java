package Iterable;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by taoLen on 5/6/2018.
 */
public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
    int hashKey = 0;
    public SongsOfThe90s(){

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    private void addSong(String songName, String bandName, int yearRelesead) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelesead);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    //public Hashtable<Integer, SongInfo> getBestSongs(){return bestSongs;};

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
