package lesson_28.test;

import lesson_28.Member;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class MemberTest {

    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String email) {
        member.setEmail(email);
        Assertions.assertEquals(startEmail, member.getEmail());

    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "test@ema@il.net",
                "test@emailnet",
                "test@.email.net",
                "test@email.ne.t",
                "test@em ail.net",
                "@test.email.net"
        );
    }





    /*
          Требования к валидности пароля
          1.done длина пароля >= 8
          2.done минимум 1 маленькая буква
          3.done мин 1 большая буква
          4. done мин 1 цифра
          5. done min спец 1 символ ("!%$@&*()[]")
         */
    @Test
    void testValidPassword() {


         String validPassword = "passworD1@";

        System.out.println("getPassword after : " + member.getPassword());

        member.setPassword(validPassword);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword, member.getPassword());

    }
    @Test
    void testValidPassword1() {

        String validPassword1 = "lOGINTO32!";
        System.out.println("getPassword after : " + member.getPassword());

        member.setPassword(validPassword1);

        System.out.println("getPassword before: " + member.getPassword());
        Assertions.assertEquals(validPassword1, member.getPassword());

    }



    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    public void testSetInvalidPassword(String password) {
        member.setPassword(password);
        Assertions.assertEquals(startPassword, member.getPassword());
    }

    /*
     Требования к валидности пароля
     1.done длина пароля >= 8
     2.done минимум 1 маленькая буква
     3.done мин 1 большая буква
     4. done мин 1 цифра
     5. done min спец 1 символ ("!%$@&*()[]")
    */
    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "worD1@",
                "PASSWORDD1@",
                "password1@",
                "passworD.@",
                "passworD.@",
                "passworD1q",
                "",
                "123123213",
                "@@@@@@@@@@@"
        );
    }


}