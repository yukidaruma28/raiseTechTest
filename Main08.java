package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main08 {
  public static void main(String[] args) {
    try {
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaおもしろい");
    } catch (IOException e) {
      //ここに入力
    }

    // 課題
    // 入出力を実装して、作ったファイルに文章を追加する
    try {
      Path movie = Path.of("MovieEdit.txt");
      Files.writeString(movie, "映画監督になる！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(movie));
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生しました");
    }
    // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う
    // catchした中で更にファイルを書き込もうとして例外になった場合、どうなるのか確認してください

    // (回答)StandardOpenOption.APPENDで.txtを開きたいが、.txtが見つからない。そして、movieを出力できず、例外を発生する。
    // 例外が発生したので、catchに飛び、例外のコードが出てきた
  }
}
