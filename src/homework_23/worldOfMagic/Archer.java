package homework_23.worldOfMagic;

public class Archer extends GameCharacter {

    public Archer(int health) {
        super(health);
    }

    @Override
    protected void attack() {
        System.out.println("Archer attack with " + health);
    }
}