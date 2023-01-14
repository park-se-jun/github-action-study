package com.example.githubactionstudy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FailTest {
    @Test
    @DisplayName("테스트 실패 - 1")
    public void git_actions테스트_실패1() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 21;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }

    @Test
    @DisplayName("테스트 실패 - 2")
    public void git_actions테스트_실패2() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 21;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }
}
