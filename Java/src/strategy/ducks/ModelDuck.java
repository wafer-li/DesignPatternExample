package strategy.ducks;

import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

/**
 * This is the ModelDuck class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:59
 */
public class ModelDuck extends Duck{

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {

        super(flyBehavior, quackBehavior);
    }


    @Override
    public void display() {

        System.out.println("I am a model duck");
    }
}
