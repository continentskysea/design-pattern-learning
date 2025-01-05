package visitor.shapes;

import visitor.visitor.Visitor;

/**
 * 共通図形インターフェース
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
