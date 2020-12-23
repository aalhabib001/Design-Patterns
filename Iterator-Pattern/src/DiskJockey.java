import java.util.Iterator;

public class DiskJockey {
    SongIterator songsOf70s;
    SongIterator songsOf80s;
    SongIterator songsOf90s;

    public DiskJockey(SongIterator songsOf70s, SongIterator songsOf80s, SongIterator songsOf90s) {
        this.songsOf70s = songsOf70s;
        this.songsOf80s = songsOf80s;
        this.songsOf90s = songsOf90s;
    }

    public void showTheSongs() {
        System.out.println("Songs of the 70s");
        printTheSongs(songsOf70s.createIterator());
        System.out.println("");
        System.out.println("Songs of the 80s");
        printTheSongs(songsOf80s.createIterator());
        System.out.println("");
        System.out.println("Songs of the 90s'");
        printTheSongs(songsOf90s.createIterator());

    }

    public void printTheSongs(Iterator songIterator) {
        while (songIterator.hasNext()) {
            SongInfo songInfo = (SongInfo) songIterator.next();
            System.out.println(songInfo.getBandName() + " - " + songInfo.getSongName() + "(" + songInfo.getYearRelease() + ")");
        }
    }
}
