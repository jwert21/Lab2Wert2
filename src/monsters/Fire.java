package monsters;

public class Fire extends Monster{

    public Fire(String name, Eyes eyes, Color color, Temperature temperature, Brightness brightness, Intensity intensity, Shape shape) {
            super(name, eyes, color, temperature, null, null, null, null, brightness, intensity, null, StateOfMatter.GAS, null, null,null, null, null, null, shape);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays fire");
        System.out.println("turns into pile of fire");
        System.out.println("surrounds himself with fire");
    }
}
