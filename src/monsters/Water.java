package monsters;

public class Water extends Monster {


    public Water(String name, Eyes eyes) {
        super(name, eyes);
    }

    @Override
    public void specialPowers() {
        System.out.println("sprays water");
    }
}
