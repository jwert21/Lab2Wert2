/** Project: Lab 2
 * Purpose Details: Monsters
 * Course: IST 242
 * Author: Jonah Wert
 * Date Developed: 2/5/2026
 * Last Date Changed: 2/8/2026
 * Rev: 2/8/2026

 */

package monsters;

public class Fire extends Monster{

    public Fire(String name, Eyes eyes, Color color, Temperature temperature, Brightness brightness, Intensity intensity, Shape shape) {
            super(name, eyes, color, temperature, null, null, null, null, brightness, intensity, null, StateOfMatter.GAS, null, null,null, null, null, null, shape);
    }

    @Override
    public void specialPowers(){
        System.out.println("sprays fire");
        System.out.println("turns into pile of fire");
        System.out.println("surrounds himself with fire");
    }
}
