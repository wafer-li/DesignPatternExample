package java_example.strategy.behaviors.quack;

/**
 * This is the Squeak class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:53
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am squeaking!");
    }
}
