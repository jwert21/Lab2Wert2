package monsters;

public abstract class Monster {

    public Monster(String name, Eyes eyes) {
        this.name = name;
        this.eyes = eyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    private Eyes eyes;

    public abstract void specialPowers();

}
