package mold_method;

/**
 * 乗り物クラス(抽象クラス)
 */
public abstract class Vehicle {
    // 動く 
    public abstract void run();
    // 止まる
    public abstract void stop();
    // クラクション
    public abstract void horn();
}