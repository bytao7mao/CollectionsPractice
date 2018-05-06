package Iterable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by taoLen on 5/6/2018.
 */
public class SongsOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;
    public SongsOfThe70s(){
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lenon", 1971);
        addSong("American Pie", "Don McDonald", 1871);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    private void addSong(String songName, String bandName, int yearRelesead) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelesead);
        bestSongs.add(songInfo);
    }

    //public ArrayList<SongInfo> getBestSongs(){return bestSongs;};

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
