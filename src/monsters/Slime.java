package monsters;

public class Slime extends Monster{

    public Slime(String name, Eyes eyes, Color color, Texture texture) {
        super(name, eyes, color, texture);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays slime");
        System.out.println("turns into pile of slime");
    }
}
