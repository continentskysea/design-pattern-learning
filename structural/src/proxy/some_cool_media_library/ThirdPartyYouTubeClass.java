package proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * リモート・サービスの実装
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYoutubeLib {
    
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("https://www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("https://www.youtube.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hMap = new HashMap<String, Video>();
        hMap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hMap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hMap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }
}