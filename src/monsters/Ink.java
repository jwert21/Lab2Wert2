package monsters;

public class Ink extends Monster{

    public Ink(String name, Eyes eyes, Color color, InkType inkType, Viscosity viscosity, ColorStrength colorstrength, Shape shape) {
        super(name, eyes, color, Temperature.COLD, null, null, null, inkType, Brightness.DARK, Intensity.WEAK, null, StateOfMatter.LIQUID, null, null, null, null, viscosity, colorstrength, shape);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays ink");
        System.out.println("turns into pile of ink");
        System.out.println("surrounds himself with ink");
    }
}
