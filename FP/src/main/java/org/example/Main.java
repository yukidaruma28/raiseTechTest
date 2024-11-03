package org.example;

import java.time.ZonedDateTime;

public class Main {

  public static void main(String[] args) {
    // 条件式を使った課題
    // 文字列型を使って、変数を2つ用意する。その変数には名字と名前を入れてください
    // 条件は名字の文字数が2文字以上の場合　かつ　名前の文字数が2文字以上の場合はtrue
    // 条件がtrueの場合はその名前のを表示する
    // 条件がfalseの場合は条件に一致しませんでした。という文言を表示する

    // 課題①
    String lastName = "たなか";
    String firstName = "いちろう";

      if (lastName.length() > 2 && firstName.length() > 2) {
        System.out.println(lastName + firstName);
      } else {
        System.out.println("条件に一致しませんでした。");
      }

    // 応用課題

    // ZoneDateTimeだと、String型になってしまうため、int型になるように調べました
    // 調べた結果、ZonedDateTime.now().getHour();にすると、int型でprintlnできることがわかりました
    // 結果、int型で出力して、if文で数字の比較を行い、条件分岐に一致するかどうかで文章を出力する形式にしました
    // https://www.javadrive.jp/start/calendar/index2.html
    ZonedDateTime time = ZonedDateTime.now();
    int hour = ZonedDateTime.now().getHour();
    int minute = ZonedDateTime.now().getMinute();

    if (hour <= 12 && minute <= 30) {
      System.out.println("12時30分より前の時間です");
    } else {
      System.out.println("12時30分より後の時間です");
    }

    if (hour <= 23 && minute <= 40) {
      System.out.println("23時40分より前の時間です");
    } else {
      System.out.println("23時40分より後の時間です");
    }

    if (hour <= 8 && minute <= 0) {
      System.out.println("8時00分より前の時間です");
    } else {
      System.out.println("8時00分より後の時間です");
    }


    // 現在時間が指定時間よりも大きいことで前の時間と判定される？
    // 先に後の時間とすることで、辻褄があう

    // これは試行錯誤したメモです
    // timeで出力してもString型で比較ができなかったので、上記の方法にしました
    System.out.println(hour + ":" + minute);
    System.out.println(time);
      }
    }