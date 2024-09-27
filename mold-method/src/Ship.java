public class Ship extends Vehicle {
    @Override
    public void run() {
        System.out.println("泳行する");
    }
    @Override
    public void stop() {
        System.out.println("停止する");
    }
    @Override
    public void horn() {
        System.out.println("フオーーーン!");
    }
}
