package monsters;

public class Fire extends Monster{

    public Fire(String name, Eyes eyes, Color color, Temperature temperature) {
            super(name, eyes, color, temperature);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays fire");
    }
}
