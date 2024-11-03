package strategy.strategies;

/**
 * 支払いメソッドの共用インターフェース
 */
public interface PayStrategy {
    // 
    boolean pay(int payment);
    void collectPaymentDetails();
}
