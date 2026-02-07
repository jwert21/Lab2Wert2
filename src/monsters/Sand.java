package monsters;

public class Sand extends Monster{

    public Sand(String name, Eyes eyes) {
        super(name, eyes);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays sand");
    }
}
