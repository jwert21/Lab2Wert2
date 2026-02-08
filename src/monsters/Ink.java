package monsters;

public class Ink extends Monster{

    public Ink(String name, Eyes eyes, Color color) {
        super(name, eyes, color);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays ink");
    }
}
