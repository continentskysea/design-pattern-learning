import state.ui.Player;
import state.ui.UI;

/**
 * 初期化コード
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
