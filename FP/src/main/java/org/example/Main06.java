package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main06 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i <= 10; i++){
      sum += i;
    }
    System.out.println(sum);

    List<String> studentNamelist = List.of("なかた","さとう","たかはし");
    System.out.println(studentNamelist);

    for(String name : studentNamelist){
      System.out.println(name);
    }

    int number = 10;
    if(number == 1) {
      System.out.println(1);
    } else if(number == 2){
      System.out.println(2);
    } else if(number == 3){
      System.out.println(3);
    } else {
      System.out.println(10);
    }
    System.out.println("───────────────────────────────────");
    // 生徒名みたいな文字列のリストを作ってください
    // リストの数は10個以上
    // リストに入っている文字数が3文字以上のものを表示する
    // このリストをループさせて繰り返し処理を実装し、その上で上記条件を満たすものだけ表示する

    System.out.println("課題①");
    List<String> studentNames = List.of("ながさき", "さとう", "みわ", "いのうえ", "はじめ", "なか",
        "いがらし", "しま", "つ", "さくら");
    for (String names : studentNames) {
      if (names.length() >= 3){
        System.out.println(names);
      }
    }


    System.out.println("課題②");
    // Mapを作ってください。生徒名と番号の組み合わせ。(1,"江並")みたいな。
    // Mapの要素は10個以上
    // Mapの中の番号が偶数のものをMapから削除する
    // 上記の処理を行う繰り返し処理を実装してください
    // 削除した状態のものを出力して表示してください
//
//      Map<Integer, String> studentNamesMap = Map.of(
//        1,"ながさき",
//        2,"さとう",
//        3,"みわ",
//        4,"いのうえ",
//        5,"はじめ",
//        6,"なか",
//        7,"いがらし",
//        8,"しま",
//        9,"つ",
//        10,"さくら"
//    );

    Map<Integer, String> studentNamesMap = new HashMap();
      studentNamesMap.put(1,"ながさき");
      studentNamesMap.put(2,"さとう");
      studentNamesMap.put(3,"みわ");
      studentNamesMap.put(4,"いのうえ");
      studentNamesMap.put(5,"はじめ");
      studentNamesMap.put(6,"なか");
      studentNamesMap.put(7,"いがらし");
      studentNamesMap.put(8,"しま");
      studentNamesMap.put(9,"つ");
      studentNamesMap.put(10,"さくら");

      for (Integer key = 0; key <= 10; key++){
        if (key % 2 == 0){
          studentNamesMap.remove(key);
        } else {
          System.out.println(studentNamesMap);
        }
      }
    }
  }