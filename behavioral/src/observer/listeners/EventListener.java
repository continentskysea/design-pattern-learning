package observer.listeners;

import java.io.File;

/**
 * 共通のオブザーバー・インターフェース
 */
public interface EventListener {
    void update(String eventType, File file);
}
