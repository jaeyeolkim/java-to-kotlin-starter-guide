package com.lannstark.lec02;

public class Lec02Main {

  static boolean kk;
  public static void main(String[] args) {
    System.out.println("args = " + kk);
  }

  public boolean startsWithA1(String str) {
    if (str == null) {
      throw new IllegalArgumentException("null이 들어왔습니다");
    }
    return str.startsWith("A");
  }


  public Boolean startsWithA2(String str) {
    if (str == null) {
      return null;
    }
    return str.startsWith("A");
  }


  public boolean startsWithA3(String str) {
    if (str == null) {
      return false;
    }
    return str.startsWith("A");
  }

}
