package monsters;

public class Fire extends Monster{

    public Fire(String name, Eyes eyes, Color color, Temperature temperature, Brightness brightness) {
            super(name, eyes, color, temperature, brightness);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays fire");
        System.out.println("turns into pile of fire");
        System.out.println("surrounds himself with fire");
    }
}
