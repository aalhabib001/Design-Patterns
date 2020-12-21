public class VideoPlayer implements MediaPlayer {
    MediaAdepter mediaAdepter;

    public VideoPlayer(){
        mediaAdepter = new MediaAdepter();
    }

    @Override
    public void play(String extension, String fileName) {
        mediaAdepter.play(extension, fileName);
    }
}
