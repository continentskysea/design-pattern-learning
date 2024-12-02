package decorator.decorators;

/**
 * 抽象基底デコレーター
 */
public abstract class DataSoucrceDecorator implements DataSource {
    private DataSource wrapper;

    DataSoucrceDecorator(DataSource source) {
        this.wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
