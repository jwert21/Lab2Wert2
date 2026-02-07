package monsters;

public class Fire extends Monster{

    public Fire(String name, Eyes eyes) {
            super(name, eyes);
    }

        @Override
        public void specialPowers(){
            System.out.println("sprays fire")
        }
}
