package java_example.strategy.behaviors.quack;

/**
 * This is the Quack class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:53
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I am quacking!");
    }
}
