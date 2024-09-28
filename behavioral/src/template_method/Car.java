package template_method;
/**
 * 車クラス(乗り物クラスの具象クラス)
 */
public class Car extends Vehicle {
    
    @Override
    public void run() {
        System.out.println("走行する");
    }

    @Override
    public void stop() {
        System.out.println("止まる");
    }

    @Override
    public void horn() {
        System.out.println("プップー!");
    }
}
