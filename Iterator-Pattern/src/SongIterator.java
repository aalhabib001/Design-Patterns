import java.util.Iterator;

public interface SongIterator {
    public Iterator createIterator();

    public void addSong(String songName, String bandName, int yearRelease);
}
