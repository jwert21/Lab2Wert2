/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly", Eyes.TWO, Color.BLUE, WaterType.SALTWATER, PH.HIGH, StateOfMatter.LIQUID, Shape.ROUND);
        Monster p2 = new Fire("Charizard", Eyes.ONE, Color.ORANGE, Temperature.HOT, Brightness.DARK, Intensity.STRONG, Shape.FLAME);
        Monster p3 = new Slime("Pikachu", Eyes.THREE, Color.GREEN, Texture.FLOAM, Viscoelasticity.ELASTIC, Bounciness.HIGH, Shape.SQUARE);
        Monster p4 = new Sand("Pichu", Eyes.ONE, Color.BEIGE, Material.SILICA, Density.HIGH, Permeability.HIGH, Shape.TRIANGLE);
        Monster p5 = new Ink("Squirtle", Eyes.TWO, Color.BLACK, InkType.PIGMENT, Viscosity.HIGH, ColorStrength.STRONG, Shape.SQUARE);

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
