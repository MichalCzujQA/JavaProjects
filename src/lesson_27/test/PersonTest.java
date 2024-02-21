package lesson_27.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test // указывает, что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;

        Assertions.assertEquals(4, result); // проверяет равны 2 значения
        Assertions.assertNotEquals(5,result); // тест будет пройден если не ожидаемый результат не совпадет с фактчиским
        assertTrue(4 == result); // проверяет что условие верно
        assertFalse(5 == result); // проверяет что условия ложно
        assertNull(null); // проверят что обьект равен null
        assertNotNull("String");// проверят что обьект не равен null

    }
}