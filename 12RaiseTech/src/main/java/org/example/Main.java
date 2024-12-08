package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 図書管理システムを作る
    // 書籍(Book)を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を使って、そこに情報を格納してください
    // 図書館(Library)みたいなものを作って、そこにBookをListで持つようなものを保持する
    // mainメソッドからこのLibraryクラスに対して検索できるようにする。Libraryクラスは書籍検索の機能を持つ。
    // タイトル検索、書籍検索、番号検索メソッドをLibraryに持たせる
    // それをmainメソッドから実行して、実行結果をコンソールに出力する

    Book book1 = new Book("吾輩は猫である", "夏目漱石", 1);
    Book book2 = new Book("夜は短し歩けよ乙女", "森見登美彦", 2);
    Book book3 = new Book("そして誰もいなくなった", "アガサ・クリスティ", 3);
    Book book4 = new Book("ノルウェイの森", "村上春樹", 4);
    Book book5 = new Book("ハリー・ポッターと賢者の石", "J.K.ローリング", 5);
    Book book6 = new Book("風と共に去りぬ", "マーガレット・ミッチェル", 6);
    Book book7 = new Book("シャーロック・ホームズの冒険", "アーサー・コナン・ドイル", 7);
    Book book8 = new Book("星の王子さま", "アントワーヌ・ド・サン＝テグジュペリ", 8);
    Book book9 = new Book("アンナ・カレーニナ", "レフ・トルストイ", 9);
    Book book10 = new Book("罪と罰", "フョードル・ドストエフスキー", 10);

//    // libraryで検索機能をnewした
//    Scanner scanner = new Scanner(System.in);
//    String library = scanner.next();
//
//    // 入力を促すメッセージ
//    System.out.print("入力してください > ");

    //入力された内容をインスタンスから取得
    List<Book> bookList = List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);
//    for (int i = 0; i < bookList.size(); i++ );
//    System.out.println(bookList);

//    if (bookList.equals("吾輩は猫である")){
//      System.out.println("吾輩は猫である");
//    }
//
//    //入力された内容を画面に表示
//    System.out.println(bookList + "が入力されました");



    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);

    // 入力を促すメッセージ
    System.out.print("入力してください > ");

    //入力された内容をインスタンスから取得
    String bookList = scanner.next();

    switch (bookList){
      case "吾輩は猫である":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "夜は短し歩けよ乙女":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "そして誰もいなくなった":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "ノルウェイの森":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "ハリー・ポッターと賢者の石":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "風と共に去りぬ":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "シャーロック・ホームズの冒険":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "星の王子さま":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "アンナ・カレーニナ":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      case "罪と罰":
        System.out.println("本の名前は『" + bookList + "』です。");
        break;

      default:
        System.out.println("本の名前が一致しません。");
    }

    // Scannerクラスのインスタンスをクローズ
    scanner.close();

  }
}