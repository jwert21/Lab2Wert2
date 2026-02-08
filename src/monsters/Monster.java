package monsters;

public abstract class Monster {

    public Monster(String name, Eyes eyes, Color color, Temperature temperature, WaterType watertype, SandMaterial sandmaterial, Texture texture, InkType inktype, Brightness brightness) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.temperature = temperature;
        this.watertype = watertype;
        this.sandmaterial = sandmaterial;
        this.texture = texture;
        this.inktype = inktype;
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

    public Color getColor() { return color; }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color color;

    public Temperature getTemperature() { return temperature; }

    public void setTemperature(Temperature temperature) { this.temperature = temperature; }

    private Temperature temperature;

    public WaterType getWaterType() { return watertype; }

    public void setWaterType(WaterType watertype) { this.watertype = watertype; }

    private WaterType watertype;

    public SandMaterial getSandMaterial() { return sandmaterial; }

    public void setSandMaterial()(SandMaterial sandmaterial) { this.sandmaterial = sandmaterial; }

    private SandMaterial sandmaterial;

    public Texture getTexture() { return texture; }

    public void setTexture()(Texture texture) { this.texture = texture; }

    private Texture texture;

    public InkType getInkType() { return inktype; }

    public void setInkType()(InkType inktype) { this.inktype = inktype; }

    private InkType inktype;

    public Brightness getBrightness() { return brightness; }

    public void setBrightness()(Brightness brightness) { this.brightness = brightness; }

    private Brightness brightness;

    public abstract void specialPowers();



}
