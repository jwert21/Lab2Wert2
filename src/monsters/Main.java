package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly");
        Monster p2 = new Fire("Charzar");

        System.out.println("Pokemon " + p1.getName());
        System.out.println("Pokemon " + p2.getName());
    }
}
