/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public class Slime extends Monster{

    public Slime(String name, Eyes eyes, Color color, Texture texture, Viscoelasticity viscoelasticity, Bounciness bounciness, Shape shape) {
        super(name, eyes, color, Temperature.COLD, null, null, texture, null, Brightness.DARK, Intensity.WEAK, null, StateOfMatter.LIQUID, viscoelasticity, bounciness, null, null, null, null, shape);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays slime");
        System.out.println("turns into pile of slime");
        System.out.println("surrounds himself with slime");
        System.out.println("bounces high off the ground");
    }
}
