public class MediaAdepter implements MediaPlayer {
    @Override
    public void play(String extension, String fileName) {
        DecoderFactory decoderFactory = new DecoderFactory();

        Decoder decoder = decoderFactory.makeDecoder(extension);

        if (decoder != null) {
            decoder.decodeHDVideo(fileName);
        }
    }
}
