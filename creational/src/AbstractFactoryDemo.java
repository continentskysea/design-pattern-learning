import abstract_factory.app.Application;
import abstract_factory.factories.GUIFactory;
import abstract_factory.factories.MacOSFactory;
import abstract_factory.factories.WindowsFactory;

/**
 * アプリの構成
 */
public class AbstractFactoryDemo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        System.out.println("AbstractFactoryパターン");
        Application  app = configureApplication();
        app.paint();
    }
}
