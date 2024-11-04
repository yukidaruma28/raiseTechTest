package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main08 {
  public static void main(String[] args) {
//    try {
//      Path path = Path.of("JavaCourse.txt");
//      Files.writeString(path, "Javaコース楽しすぎる！", StandardOpenOption.APPEND);
//      System.out.println(Files.readString(path));
//    } catch (IOException e) {
//      // ここで処理を行う
//      // すると例外はなかったことになる
//    }

    // 課題
    // 入出力を実装して、作ったファイルに文章を追加する
    // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う
    try {
      Path movie = Path.of("MovieEdit.txt");
      Files.writeString(movie, "動画編集大変すぎる！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(movie));
    } catch (IOException e) {
//      e.printStackTrace();
//      System.out.println("例外が発生しました");
    }
    // catchした中で更にファイルを書き込もうとして例外になった場合、どうなるのか確認してください



  }
}
