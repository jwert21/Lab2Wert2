/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public abstract class Monster {

    public Monster(String name, Eyes eyes, Color color, Temperature temperature, WaterType waterType, Material material, Texture texture, InkType inkType, Brightness brightness, Intensity intensity, PH ph, StateOfMatter state, Viscoelasticity viscoelasticity, Bounciness bounciness, Density density, Permeability permeability, Viscosity viscosity, ColorStrength colorstrength, Shape shape) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.temperature = temperature;
        this.waterType = waterType;
        this.material = material;
        this.texture = texture;
        this.inkType = inkType;
        this.brightness = brightness;
        this.intensity = intensity;
        this.ph = ph;
        this.state = state;
        this.viscoelasticity = viscoelasticity;
        this.bounciness = bounciness;
        this.density = density;
        this.permeability = permeability;
        this.viscosity = viscosity;
        this.colorstrength = colorstrength;
        this.shape = shape;
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

    public WaterType getWaterType() { return waterType; }

    public void setWaterType(WaterType waterType) { this.waterType = waterType; }

    private WaterType waterType;

    public Material getMaterial() { return material; }

    public void setMaterial(Material material) { this.material = material; }

    private Material material;

    public Texture getTexture() { return texture; }

    public void setTexture(Texture texture) { this.texture = texture; }

    private Texture texture;

    public InkType getInkType() { return inkType; }

    public void setInkType(InkType inkType) { this.inkType = inkType; }

    private InkType inkType;

    public Brightness getBrightness() { return brightness; }

    public void setBrightness(Brightness brightness) { this.brightness = brightness; }

    private Brightness brightness;

    public Intensity getIntensity() { return intensity; }

    public void setIntensity(Intensity intensity) { this.intensity = intensity; }

    private Intensity intensity;

    public PH getPH() { return ph; }

    public void setPH(PH ph) {this.ph = ph; }

    private PH ph;

    public StateOfMatter getStateOfMatter() { return state; }

    public void setStateOfMatter(StateOfMatter state) { this.state = state; }

    private StateOfMatter state;

    public Viscoelasticity getViscoelasticity() { return viscoelasticity; }

    public void setViscoelasticity(Viscoelasticity viscoelasticity) { this.viscoelasticity = viscoelasticity;}

    private Viscoelasticity viscoelasticity;

    public Bounciness getBounciness() { return bounciness; }

    public void setBounciness(Bounciness bounciness) { this.bounciness = bounciness; }

    private Bounciness bounciness;

    public Density getDensity() { return density; }

    public void setDensity(Density density) { this.density = density; }

    private Density density;

    public Permeability getPermeability() { return permeability; }

    public void setPermeability(Permeability permeability) { this.permeability = permeability; }

    private Permeability permeability;

    public Viscosity getViscosity() { return viscosity; }

    public void setViscosity(Viscosity viscosity) { this.viscosity = viscosity; }

    private Viscosity viscosity;

    public ColorStrength getColorStrength() { return colorstrength; }

    public void setColorStrength(ColorStrength colorstrength) { this.colorstrength = colorstrength; }

    private ColorStrength colorstrength;

    public Shape getShape() { return shape; }

    public void setShape(Shape shape) { this.shape = shape; }

    private Shape shape;

    public abstract void specialPowers();




}
