package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }
    @Test
    fun shouldReturn1WhenCall2() {
        // given

        // when
        val result: Int = underTest.fibonacci(2)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn5WhenCall5() {
        // given

        // when
        val result: Int = underTest.fibonacci(5)
        // then
        Assertions.assertEquals(5, result)
    }
    // TODO - Test with greater numbers and test edge cases
}