package homework_18;

/*
Написать класс Собака.

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

-За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

--Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
 Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

public class Dog {

    private String name;
    private int jumpHigh;

    private int maxJumpHeight;


    private static int increasePerOneTraining;

    static {
        increasePerOneTraining = 10;
    }

    public Dog(String name, int jumpHigh) {
        this.name = name;
        this.jumpHigh = jumpHigh;
        this.maxJumpHeight = jumpHigh * 2;
    }


    public void jump() {
        System.out.println("Dog " + name + " just jumped!");
    }

    private void training() {
        this.jumpHigh += increasePerOneTraining;

        //  jumpHigh = (jumpHigh > maxJumpHeight) ? maxJumpHeight : jumpHigh;
        jumpHigh = Math.min(jumpHigh, maxJumpHeight);


    }

    public boolean takeBarrier(int barrier) {

        System.out.println(name + " jump: " + jumpHigh + "; barrier: " + barrier + " | beginning method takeBarrier");
        if (jumpHigh >= barrier) {
            jump();
            System.out.println("if jumpHigh >= barrier --> true" + name + " jump: " + jumpHigh + "; barrier: " + barrier);
            return true;
        } else {
            if (maxJumpHeight >= barrier) {

                do {
                    training();
                } while (jumpHigh < barrier);


                jump();

                System.out.println(" if maxJumpHeight >= barrier : true -->" + name + " jump: " + jumpHigh + "; barrier: " + barrier);
                return true;
            } else {
                System.out.println("Sorry, i cannot higher jump, im Dog!");
                System.out.println(" if maxJumpHeight >= barrier : FALSE ->" + name + " jump: " + jumpHigh + "; barrier: " + barrier);

                return false;
            }
        }
    }

    public void info() {
        System.out.println("Dog: " + name + "; Right now i can jump " + jumpHigh + " | " + maxJumpHeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
