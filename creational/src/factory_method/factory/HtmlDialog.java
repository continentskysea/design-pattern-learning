package factory_method.factory;

import factory_method.buttons.Button;
import factory_method.buttons.HtmlButton;

/**
 * 具象クリエーター
 */
public class HtmlDialog extends Dialog {
    
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
