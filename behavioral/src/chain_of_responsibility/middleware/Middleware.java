package chain_of_responsibility.middleware;

/**
 * 基本的な検証インターフェース
 */
public abstract class Middleware {
    private Middleware next;


    // ミドルウェアオブジェクトのチェーンを構築する
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    // サブクラスは、具体的なチェックでこのメソッドを実装する
    public abstract boolean check(String email, String password);

    // チェーン内の次のオブジェクトのチェックを実行するか、チェーン内の最後のオブジェクトにいるトラバースを終了する
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
