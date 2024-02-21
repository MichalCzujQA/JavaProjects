package homework_22.runners;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateurRunner = new AmateurRunner();
        ProfRunner profRunner = new ProfRunner();



        human.run();
        System.out.println();
        amateurRunner.run();
        System.out.println();
        profRunner.run();
    }


}
