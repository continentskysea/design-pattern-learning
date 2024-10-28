package facade.some_complex_media_library;

/**
 * バイナリ読み取りクラス
 */
public class BitrateReader {
    /**
     * 
     * @param file
     * @param codec
     * @return file 読み込んだファイルの形式
     */
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    /**
     * 
     * @param buffer
     * @param codec
     * @return buffer 変換後のバッファ
     */
    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
