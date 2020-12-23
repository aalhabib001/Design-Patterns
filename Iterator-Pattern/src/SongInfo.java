public class SongInfo {
    protected String songName;
    protected String bandName;
    protected int yearRelease;

    public SongInfo(String songName, String bandName, int yearRelease) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearRelease = yearRelease;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearRelease() {
        return yearRelease;
    }
}
