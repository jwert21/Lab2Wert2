package monsters;

public abstract class Monster {

    public Monster(String name, Eyes eyes, Color color) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
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

    public Color setColor(Color color) {
        this.color = color;
    }

    public abstract void specialPowers();

}
