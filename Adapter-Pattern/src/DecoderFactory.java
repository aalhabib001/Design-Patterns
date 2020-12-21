public class DecoderFactory {

    public Decoder makeDecoder(String fileType){
        Decoder decoder = null;

        if(fileType.toLowerCase().equals("mp4")){
            decoder = new MP4Decoder();
            return decoder;
        }
        else if(fileType.toLowerCase().equals("mkv")){
            decoder = new MKVDecoder();
            return decoder;
        }
        else{
            System.out.println("This Format is Not Supported");
        }

        return null;


    }


}
