package strategy.ducks;

import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

/**
 * This is the MallardDuck class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:45
 */
public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {

        super(flyBehavior, quackBehavior);
    }


    @Override
    public void display() {

        System.out.println("I am a mallard duck");
    }
}
