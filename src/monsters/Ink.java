package monsters;

public class Ink extends Monster{

    public Ink(String name, Eyes eyes) {
        super(name, eyes);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays ink");
    }
}
