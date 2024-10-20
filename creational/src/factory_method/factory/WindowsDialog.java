package factory_method.factory;

import factory_method.buttons.Button;
import factory_method.buttons.WindowsButtons;

/**
 * もう一つの具象クリエーター
 */
public class WindowsDialog extends Dialog {    

    @Override
    public Button createButton() {
        return new WindowsButtons();
    }

}
