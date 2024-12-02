import decorator.decorators.CompressionDecorator;
import decorator.decorators.DataSoucrceDecorator;
import decorator.decorators.DataSource;
import decorator.decorators.EncryptionDecorator;
import decorator.decorators.FileDataSource;

public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("Docoratorパターン");

        String salaryRecords = "Name, Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSoucrceDecorator encoded = new CompressionDecorator(
            new EncryptionDecorator(
                new FileDataSource("out/OutputDemo.txt")
            )
        );
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded ----------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded ----------------");
        System.out.println(encoded.readData());
    }
}
