package lesson_27.person;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email))
            this.email = email;
    }

    /*
     1. done @ должен быть, и должен быть только один
     2. done точка после собаки
     3. done точка не может быть сразу после собаки
     4. done После последней точки должно быть не менее двух симолов
     5. done могут присутствовать символы алфавита, цифры, "-" , "_" , "." , "@"
     6. done Первый символ должен быть - алфавитный ?
      = done Место для @ - хотя бы один символ до собаки
     */
    private boolean isEmailValid(String email) {
        // проверяем что пришел не null и пустая строка
        if (email == null || email.isEmpty()) return false;

        //tttt@ttr@trt.net
        // 1. @ |
        int indexAt = email.indexOf("@");
        if (indexAt <= 0 || indexAt != email.lastIndexOf("@")) return false;

        // 2. Должна быть точка послы собаки
        //перегрузка метода - начинает поиск с индекса ( в данном случае индекса знака @)

        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));

        if (!isCharAlphabetic) return false;

        //5. могут присутствовать символы алфавита, цифры, "-" , "_" , "." , "@"
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            // true, если символ удовлетворяет хотя бы одному критерию.
            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '.'
                    || c == '@');
            if (!isCharValid) return false;
        }

        // все проверки пройдены, нигде метод не вернул false ->
        return true;
    }

    /*
          Требования к валидности пароля
          1.done длина пароля >= 8
          2.done минимум 1 маленькая буква
          3.done мин 1 большая буква
          4. done мин 1 цифра
          5. done min спец 1 символ ("!%$@&*()[]")
         */
    public boolean getPassword(String password) {
        if (password == null || password.isEmpty()) return false;

        //  done длина пароля >= 8
        if (password.length() < 8) return false;


        //  минимум 1 маленькая буква
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        //done мин 1 большая буква
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        // мин 1 цифра
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }

        //in спец 1 символ ("!%$@&*()[]")
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);


            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '!'
                    || c == '%'
                    || c == '$'
                    || c == '@'
                    || c == '&'
                    || c == '*');
            if (!isCharValid) return false;


        }
        return true;

    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }
}
