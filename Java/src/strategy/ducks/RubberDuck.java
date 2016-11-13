package strategy.ducks;

import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

/**
 * This is the RubberDuck class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:46
 */
public class RubberDuck extends Duck{

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {

        super(flyBehavior, quackBehavior);
    }


    @Override
    public void display() {

        System.out.println("I am a rubber duck");
    }
}
