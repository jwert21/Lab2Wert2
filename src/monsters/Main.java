package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly", Eyes.TWO);
        Monster p2 = new Fire("Charzar", Eyes.ONE);
        Monster p3 = new Slime("Pikachu", Eyes.THREE);

        System.out.println("Pokemon 1 " + p1.getName());
        System.out.println("Pokemon 2 " + p2.getName());
        System.out.println("Pokemon 3 " + p3.getName());

        p1.specialPowers();
        p2.specialPowers();
        p3.specialPowers();
    }
}
