package proxy.downloader;

import java.util.HashMap;

import proxy.some_cool_media_library.ThirdPartyYoutubeLib;
import proxy.some_cool_media_library.Video;

public class YouTubeDownloader{
    private ThirdPartyYoutubeLib api;

    public YouTubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }
    
    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("ID: " + video.title);
        System.out.println("ID: " + video.data);
        System.out.println("-------------------------------\n");
    }
    
    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
