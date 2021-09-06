package com.charlie;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListClientExampleTest {

  @Test
  public void testListClientExample() {
    ListClientExample lce = new ListClientExample();
    List list = lce.getList();
    assertThat(list.getClass()).isInstanceOf(ArrayList.class);
  }

}
