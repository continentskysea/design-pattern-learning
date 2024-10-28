// import adapter.adapters.SquarePegAdapter;
// import adapter.round.RoundHole;
// import adapter.round.RoundPeg;
// import adapter.square.SquarePeg;

import java.io.File;

import facade.facades.VideoConversionFacade;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("facadeパターン");

        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // // 丸穴(半径5)
        // RoundHole hole = new RoundHole(5);
        // // 丸杭(半径5)\
        // RoundPeg rPeg = new RoundPeg(5);
        
        // System.out.println("Adapter Pattern (丸い穴と丸い杭と正方形の杭)");
        
        // // 穴にフィットするか判定
        // if (hole.fits(rPeg)) {
        //     System.out.println("半径5cmの丸い杭は半径5cmの丸い穴に合います。");
        // }

        // // このまま判定するとコンパイルできない
        // // 正方形の杭(小・幅2)
        // SquarePeg smallSquarePeg = new SquarePeg(2);
        // // 正方形の杭(大・幅20)
        // SquarePeg largeSquarePeg = new SquarePeg(20);
        
        // // アダプタークラスを使って解消する
        // SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        // SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        // if (hole.fits(smallSquarePegAdapter)) {
        //     System.out.println("幅2cmの正方形の杭は半径5cmの穴に合います。");
        // } 
        // if (!hole.fits(largeSquarePegAdapter)) {
        //     System.out.println("幅20cmの正方形の杭は半径5cmの穴に合いません。");
        // }
    }
}
