import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    SongInfo[] bestSongs;
    int indexValue = 0;

    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];
        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Banana rama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    @Override
    public void addSong(String songName, String bandName, int yearRelease) {
        SongInfo newSong = new SongInfo(songName, bandName, yearRelease);
        bestSongs[indexValue] = newSong;
        indexValue++;
    }

//    public SongInfo[] getBestSongs() {
//        return bestSongs;
//    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }


}
