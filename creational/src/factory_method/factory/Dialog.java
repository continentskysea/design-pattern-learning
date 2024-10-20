package factory_method.factory;

import factory_method.buttons.Button;
/**
 * 基底クリエーター
 */
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
