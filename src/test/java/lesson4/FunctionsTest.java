package lesson4;

import com.geekbrains.lesson4.Cat;
import com.geekbrains.lesson4.Functions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static com.geekbrains.lesson4.Functions.isPalindrome;


public class FunctionsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("метод выполнится 1 раз перед всеми тестами в классе");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("метод выполняется перед каждым тестом в классе");
    }
    @Test
    @DisplayName("метод проверки палиндрома, где переданное значение палиндром")
    void givenPalindromeWhenCallIsPalindromeThenTrue() {
        boolean result = isPalindrome("112211");
        Assertions.assertTrue(result);
        // Assertions.assertEquals(true, result);
    }

    @Test
    @DisplayName("метод проверки палиндрома с пустым значением")
    void givenPalindromeWhenCallIsPalindromeThenTrueNull() {
        boolean result = isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("метод проверки палиндрома, где переданное значение меньше 2 символов")
    void givenPalindromeWhenCallIsPalindromeThenTrueOne() {
        boolean result = isPalindrome("112211");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("метод проверки палиндрома, где переданное значение не палиндром")
    void givenPalindromeWhenCallIsPalindromeThenFalse() {
        boolean result = isPalindrome("123456");
        Assertions.assertEquals(false, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"112211", "1123211"})
    void isPalindromeTestWithDataProvider(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"123, false", "121, true"})
    void csvTest(String word, boolean expectedResult) {
        boolean actualResult = isPalindrome(word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("catAndAgeDataProvider")
    void catEqualsAgeTest(Cat cat, Integer age) {
        Assertions.assertEquals(cat.getAge(), age);
    }

    //метод источник тестовых данных для @MethodSource()
    private static Stream<Arguments> catAndAgeDataProvider() {
        return Stream.of(
                Arguments.of(new Cat("test1", 10),10),
                Arguments.of(new Cat("test2", 11),11),
                Arguments.of(new Cat("test3", 15),15)
        );
    }

    @AfterEach
    void afterEach () {
        System.out.println("метод выполнится 1 раз после каждого теста в классе");
    }

    @AfterAll
    static void afterAll () {
        System.out.println("метод выполнится 1 раз после всех тестов в классе");
    }
}
