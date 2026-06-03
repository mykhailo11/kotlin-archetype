package me.programs

import me.programs.providers.TestApplicationArgProvider
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

class TestApplication {

    @ParameterizedTest
    @ArgumentsSource(TestApplicationArgProvider::class)
    fun `'a' plus 'b' is 'c'`(a: Int, b: Int, c: Int) {
        // Arrange

        // Act
        val result = a + b;

        // Assert
        assertEquals(result, c);
    }

}