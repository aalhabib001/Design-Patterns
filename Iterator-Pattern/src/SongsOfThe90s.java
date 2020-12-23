import java.util.HashSet;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
    HashSet<SongInfo> bestSongs;

    public SongsOfThe90s() {
        bestSongs = new HashSet<>();
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radio head", 1993);
        addSong("Walk on The Ocean", "Toad The Wet Sprocket", 1991);
    }

    @Override
    public void addSong(String songName, String bandName, int yearRelease) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRelease);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
