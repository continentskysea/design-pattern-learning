package bridge.remotes;

/**
 * すべてのリモコンに共通なインターフェース
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
