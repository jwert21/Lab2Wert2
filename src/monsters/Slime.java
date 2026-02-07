package monsters;

public class Slime extends Monster{

    public Slime(String name, Eyes eyes) {
        super(name, eyes);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays slime");
    }
}
