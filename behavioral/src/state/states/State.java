package state.states;

import state.ui.Player;

/**
 * 共通の状態インターフェース
 */
public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
