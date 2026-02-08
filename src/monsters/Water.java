package monsters;

public class Water extends Monster {


    public Water(String name, Eyes eyes, Color color) {
        super(name, eyes, color);
    }

    @Override
    public void specialPowers() {
        System.out.println("sprays water");
    }
}
