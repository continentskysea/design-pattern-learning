package decorator.decorators;

/**
 * 読み書きの操作を定義する共通データ・インターフェース
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
