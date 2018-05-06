package Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by taoLen on 5/6/2018.
 */
public class SongsOfThe80s implements SongIterator{
    SongInfo[] bestSongs;
    int arrayValue = 0;
    public SongsOfThe80s(){
        bestSongs = new SongInfo[3];
        addSong("Room", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("head Over Heels", "Tears for Fears", 1985);
    }

    private void addSong(String songName, String bandName, int yearRelesead) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelesead);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    //public SongInfo[] getBestSongs(){return bestSongs;};

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
