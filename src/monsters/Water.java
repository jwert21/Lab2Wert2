package monsters;

public class Water extends Monster {


    public Water(String name, Eyes eyes, Color color, Type type) {
        super(name, eyes, color, type);
    }

    @Override
    public void specialPowers() {
        System.out.println("sprays water");
    }
}
