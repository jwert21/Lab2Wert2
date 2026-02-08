package monsters;

public class Sand extends Monster{

    public Sand(String name, Eyes eyes, Color color, SandType sandtype) {
        super(name, eyes, color, sandtype);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays sand");
        System.out.println("turns into pile of sand")
    }
}
