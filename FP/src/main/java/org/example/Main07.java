package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main07 {
  public static void main(String[] args){
    List<Integer> numberlist = List.of(1,2,3,4,5,6,7,8,9,10);
    numberlist.stream().mapToInt(number -> number)
        .filter(number -> number <= 5)
        .forEach(System.out::println);

    numberlist.stream()
        .limit(3)
        .forEach(System.out::println);

    List<String> studentList = List.of("inoue", "enami", "tanaka", "enami");

    System.out.println(studentList.stream()
        .map(String::toUpperCase)
        .distinct()
        );

    System.out.println("──────────────────────────");

    System.out.println("【課題1】");
    //課題1
    // 今日紹介したものは一通り実装してください
    List<String> teacherList = List.of("hashimoto", "ezaki", "igarashi", "higuchi", "igarashi");

    // distinctで重複除外、sortedでアルファベット順にする、最後に大文字にして出力する
    teacherList.stream()
        .distinct()
        .sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);

    // 課題2
    // 文字列のリストを作る。要素数は10個
    // その文字列に対して、文字数が2以上のものを抽出して、文字列に変換してください。区切り文字はカンマ（,）で行ってください
    // その文字列を出力してください

    // メモ1：文字数の長さを抽出するときは、v.length()を使う
    // 参考URL：https://java-code.jp/1501
    System.out.println("【課題2】");

    List<String> friendNames = List.of("ながさき", "さとう", "みわ", "いのうえ", "はじめ", "なか",
        "いがらし", "しま", "つ", "さくら");

    System.out.println("出力形式1");
    System.out.println(friendNames.stream()
        .filter(v -> v.length() >= 2)
        .collect(Collectors.joining(","))
    );

    System.out.println("出力形式2");
    System.out.println(friendNames.stream()
        .filter(v -> v.length() >= 2)
        .toList()
    );

    //課題3
    // 数値のリストを作ってください。要素数は10個
    // その数値の中、奇数のものをだけを抽出して、平均値を出してください
    // 要素10個の平均値を出してください

    // 参考URL https://enterprisegeeks.hatenablog.com/entry/2014/04/08/193834
    // 数値なのでList<Integer>にして、そのままfilterで数字の偶数奇数を判定したものの・・・
    //  .mapToInt();をどうやって使えばいいのかわからない・・・
    //  .averageを使うために、int型にすることが必要？
    System.out.println("【課題3】");
    List<Integer> testScore = List.of(48, 27, 14, 89, 35, 66, 5, 92, 74, 60);

    System.out.println(testScore.stream()
        .filter(n -> n % 2 == 1)
        .toList()
    );

    testScore.stream()
        .filter(n -> n % 2 == 1)
        .forEach(System.out::println);








    System.out.println("【課題4】");
    // ChatGPTを使って、StreamAPIの基礎的な課題を1つ作ってもらい、実践してみる




    //質問 forEachとprintlnでの出力形式の違いは？

  }
}