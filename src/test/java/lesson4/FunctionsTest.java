package lesson4;

import com.geekbrains.lesson4.Functions;
import org.junit.jupiter.api.*;


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
        boolean result = Functions.isPalindrome("112211");
        Assertions.assertTrue(result);
        // Assertions.assertEquals(true, result);
    }

    @Test
    @DisplayName("метод проверки палиндрома с пустым значением")
    void givenPalindromeWhenCallIsPalindromeThenTrueNull() {
        boolean result = Functions.isPalindrome("");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("метод проверки палиндрома, где переданное значение меньше 2 символов")
    void givenPalindromeWhenCallIsPalindromeThenTrueOne() {
        boolean result = Functions.isPalindrome("112211");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("метод проверки палиндрома, где переданное значение не палиндром")
    void givenPalindromeWhenCallIsPalindromeThenFalse() {
        boolean result = Functions.isPalindrome("123456");
        Assertions.assertEquals(false, result);
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
