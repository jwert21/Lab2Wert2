package monsters;

public class Ink extends Monster{

    public Ink(String name, Eyes eyes, Color color, InkType inktype) {
        super(name, eyes, color, inktype);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays ink");
        System.out.println("turns into pile of ink");
    }
}
