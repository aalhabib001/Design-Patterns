public class PlayDemo {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.play("mp4", "Data Structure.mp4");
        videoPlayer.play("mkv", "Algorithm.mkv");
        videoPlayer.play("mp3", "database.mp3");
    }
}
