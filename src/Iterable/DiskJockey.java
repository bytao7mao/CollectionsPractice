package Iterable;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by taoLen on 5/6/2018.
 */
public class DiskJockey {
    SongsOfThe70s songsOfThe70s;
    SongsOfThe80s songsOfThe80s;
    SongsOfThe90s songsOfThe90s;

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;


    public DiskJockey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s) {
        this.iter70sSongs = songsOfThe70s;
        this.iter80sSongs = songsOfThe80s;
        this.iter90sSongs = songsOfThe90s;
    }

//    public void showTheSongs(){
//        //70s
//        ArrayList al70sSongs = songsOfThe70s.getBestSongs();
//        System.out.println("Songs of the 70's\n");
//        for (int i = 0; i < al70sSongs.size(); i++) {
//             SongInfo bestSongs = (SongInfo) al70sSongs.get(i);
//
//            System.out.printf("song name: %s, band name: %s, year released: %d \n", bestSongs.getSongName(), bestSongs.getBandName(), bestSongs.getYearReleased());
//        }
//
//        //80s
//        SongInfo[] array80sSongs = songsOfThe80s.getBestSongs();
//        System.out.println("Songs of the 80's\n");
//        for (int i = 0; i < array80sSongs.length; i++) {
//            SongInfo bestSongs = (SongInfo) array80sSongs[i];
//
//            System.out.printf("song name: %s, band name: %s, year released: %d \n", bestSongs.getSongName(), bestSongs.getBandName(), bestSongs.getYearReleased());
//        }
//
//
//        //90s
//        Hashtable<Integer, SongInfo> ht90sSongs = songsOfThe90s.getBestSongs();
//        System.out.println("Songs of the 90's\n");
//        for (Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
//            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
//
//            System.out.printf("song name: %s, band name: %s, year released: %d \n", bestSongs.getSongName(), bestSongs.getBandName(), bestSongs.getYearReleased());
//        }
//    }


    public void showTheSongs2(){
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter70sSongs.createIterator();
        Iterator songs90s = iter70sSongs.createIterator();

        System.out.println("Songs of the 70s \n");
        printTheSongs(songs70s);
        System.out.println("Songs of the 80s \n");
        printTheSongs(songs80s);
        System.out.println("Songs of the 90s \n");
        printTheSongs(songs90s);

    }

    public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.printf("song name: %s, band name: %s, year released: %d \n", songInfo.getSongName(), songInfo.getBandName(), songInfo.getYearReleased());

        }

    }
}
