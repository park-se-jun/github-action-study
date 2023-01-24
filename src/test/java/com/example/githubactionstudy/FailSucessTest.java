package com.example.githubactionstudy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FailSucessTest {
    @Test
    @DisplayName("테스트 실패에서 성공으로 - 1")
    public void git_actions테스트_실패() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 2;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }

    @Test
    @DisplayName("테스트 실패에서 성공으로 - 2")
    public void git_actions테스트_실패2() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 2;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }

    @Test
    @DisplayName("테스트 성공 - 1")
    public void git_actions테스트_성공() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 2;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }

    @Test
    @DisplayName("테스트 성공 - 2")
    public void git_actions테스트_성공2() throws Exception {
        //given
        Integer test = 1;
        Integer expect = 2;
        //when
        test += 1;
        //then
        Assertions.assertThat(test).isEqualTo(expect);
    }
}
