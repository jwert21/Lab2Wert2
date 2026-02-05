package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly", Eyes.TWO);
        Monster p2 = new Fire("Charzar", Eyes.ONE);

        System.out.println("Pokemon 1 " + p1.getName());
        System.out.println("Pokemon 2 " + p2.getName());
    }
}
