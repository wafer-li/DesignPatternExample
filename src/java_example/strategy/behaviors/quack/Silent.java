package java_example.strategy.behaviors.quack;

/**
 * This is the Silent class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:54
 */
public class Silent implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("I cannot quack!");
    }
}
