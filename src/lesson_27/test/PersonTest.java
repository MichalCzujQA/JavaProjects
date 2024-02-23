package lesson_27.test;

import lesson_28.test.EnumTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Method @BeforeEACH");
    }
//    @BeforeAll - метод запускается один раз перед выполнением первого теста
//    @AfterAll - выполнятся после каждого тестового метода
//    @AfterEach - выполняется один раз после всех тестовых методов
//    @Disabled - Указывает, что тест или группа тестов отключена и віполнятся не будет
    // @Nested-  позволяет создавать вложенный тестовый клас. может быть использовано для группировеи тестовых методов


    @Test // указывает, что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;

        Assertions.assertEquals(4, result); // проверяет равны 2 значения
        Assertions.assertNotEquals(5, result); // тест будет пройден если не ожидаемый результат не совпадет с фактчиским
        assertTrue(4 == result); // проверяет что условие верно
        assertFalse(5 == result); // проверяет что условия ложно
        assertNull(null); // проверят что обьект равен null
        assertNotNull("String");// проверят что обьект не равен null

    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)
    void testEnum(EnumTest value) { // в качестве источника набора констант из перечисления
        assertNotNull(value);
    }

    // в качестве источника данных может быть статических метод
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitMethodSource(String argument) {
        System.out.println("current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "fig", "orange");
    }


    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 2, false", "cherry, 3, true"})
    public void testWithCsvSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEqual) {
        int result = input * input;
        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);
    }
    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true), //
                Arguments.of(3,9, true),
                Arguments.of(4,15, false)
        );
    }


    @Nested
    @Disabled
    class NestedTest {
        @BeforeEach
        public void setStartValue() {
            System.out.println("nested BeforeEach");
        }

        @Test
        void TestNested() {
            Assertions.assertEquals(5, 5);
        }
    }

    @Disabled
    @Test
    public void testMethod() {
        System.out.println("Test Method");
        Assertions.assertEquals(2, 5);
    }
}