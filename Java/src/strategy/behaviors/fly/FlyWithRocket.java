package strategy.behaviors.fly;

/**
 * This is the FlyWithRocket class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:52
 */
public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with rocket!");
    }
}
