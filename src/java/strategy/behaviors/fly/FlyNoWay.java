package java.strategy.behaviors.fly;

/**
 * This is the FlyNoWay class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:51
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
