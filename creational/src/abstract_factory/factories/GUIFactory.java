package abstract_factory.factories;

import abstract_factory.buttons.Button;
import abstract_factory.checkboxes.Checkbox;

/**
 * 抽象ファクトリー
 */
public interface GUIFactory {
    Button createButton();
    Checkbox creatCheckbox();
}
