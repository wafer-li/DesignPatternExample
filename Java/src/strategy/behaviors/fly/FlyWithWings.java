package strategy.behaviors.fly;

/**
 * This is the FlyWithWings class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:50
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I am flying with wings!");
    }
}
