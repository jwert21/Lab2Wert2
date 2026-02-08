package monsters;

public class Water extends Monster {


    public Water(String name, Eyes eyes, Color color, WaterType watertype) {
        super(name, eyes, color, watertype);
    }

    @Override
    public void specialPowers() {
        System.out.println("sprays water");
    }
}
