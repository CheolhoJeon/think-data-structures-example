package com.charlie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {

  private List list;

  public ListClientExample() {
    // 유일한 변경 부분
    list = new ArrayList();
  }

  public List getList() {
    return list;
  }

  public static void main(String[] args) {
    ListClientExample lce = new ListClientExample();
    List list = lce.getList();
    System.out.println(list);
  }

}
