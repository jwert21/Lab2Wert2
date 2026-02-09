/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public class Water extends Monster {


    public Water(String name, Eyes eyes, Color color, WaterType waterType, PH ph, StateOfMatter state, Shape shape) {
        super(name, eyes, color, Temperature.COLD, waterType, null, null, null, Brightness.DARK, Intensity.WEAK, ph, state, null, null, null, null, null, null, shape);
    }

    @Override
    public void specialPowers() {
        System.out.println("sprays water");
        System.out.println("turns into pile of water");
        System.out.println("surrounds himself with water");
    }
}
