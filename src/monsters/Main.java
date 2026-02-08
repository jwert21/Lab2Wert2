package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly", Eyes.TWO, Color.BLUE, WaterType.SALTWATER);
        Monster p2 = new Fire("Charizard", Eyes.ONE, Color.ORANGE, Temperature.HOT);
        Monster p3 = new Slime("Pikachu", Eyes.THREE, Color.GREEN, Texture.FLOAM);
        Monster p4 = new Sand("Pichu", Eyes.ONE, Color.BEIGE, SandMaterial.SILICA);
        Monster p5 = new Ink("Squirtle", Eyes.TWO, Color.BLACK);

        System.out.println("Pokemon 1 " + p1.getName());
        System.out.println("Pokemon 2 " + p2.getName());
        System.out.println("Pokemon 3 " + p3.getName());
        System.out.println("Pokemon 4 " + p4.getName());
        System.out.println("Pokemon 5 " + p5.getName());

        p1.specialPowers();
        p2.specialPowers();
        p3.specialPowers();
        p4.specialPowers();
        p5.specialPowers();
    }
}
