package proxy.some_cool_media_library;

import java.util.HashMap;

/**
 * リモート・サービス・インターフェース
*/
public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
