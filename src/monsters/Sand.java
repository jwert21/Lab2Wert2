/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public class Sand extends Monster{

    public Sand(String name, Eyes eyes, Color color, Material material, Density density, Permeability permeability, Shape shape) {
        super(name, eyes, color, Temperature.HOT, null, material, null, null, Brightness.DARK, Intensity.WEAK, null, StateOfMatter.SOLID, null, null, density, permeability, null, null, shape);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays sand");
        System.out.println("turns into pile of sand");
        System.out.println("surrounds himself with sand");
    }
}
