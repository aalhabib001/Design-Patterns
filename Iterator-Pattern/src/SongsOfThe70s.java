import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagination", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    @Override
    public void addSong(String songName, String bandName, int yearRelease) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelease);
        bestSongs.add(songInfo);
    }

//    public ArrayList<SongInfo> getBestSongs() {
//        return bestSongs;
//    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
