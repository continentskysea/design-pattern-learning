package memento.commands;

/**
 * 基底コマンド・クラス
 */
public interface Command {
    String getName();
    void execute();
}
