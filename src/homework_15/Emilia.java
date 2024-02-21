package homework_15;

/*
Посмотрите вокруг себя. Напишите три класса,
 описывающие какие-то сущности вокруг Вас. Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
 */
public class Emilia {

    public String name;
    public String gender;
    public int age;

    public Emilia(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    void sleep() {

        System.out.println(" is sleeping");
    }

    void eat() {

        System.out.println( " is eating");
    }

    void play() {

        System.out.println(" is playing");
    }






    /*
    String name;
    String girl;
    int age;


    public Emilia() {

    }


    public Emilia(String emiliaName) {

        name = emiliaName;
    }



    void sleep() {
        //String name = "Emilia";
        System.out.println(name + " is sleeping");
    }

    void eat() {
        // String name = "Emilia";
        System.out.println(name + " is eating");
    }

    void play() {
        //String name = "Emilia";
        System.out.println(name + " is playing");
    }

     */


}
