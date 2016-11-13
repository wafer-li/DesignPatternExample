package strategy.ducks;

import strategy.behaviors.fly.FlyBehavior;
import strategy.behaviors.quack.QuackBehavior;

/**
 * This is the Duck class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 14:44
 */
class Duck {
    private FlyBehavior   flyBehavior;
    private QuackBehavior quackBehavior;


    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {

        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }


    public void display() {
        System.out.println("I am a normal duck");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {

        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {

        this.quackBehavior = quackBehavior;
    }
}
