package java.strategy;

import java.strategy.behaviors.fly.FlyNoWay;
import java.strategy.behaviors.fly.FlyWithRocket;
import java.strategy.behaviors.fly.FlyWithWings;
import java.strategy.behaviors.quack.Quack;
import java.strategy.behaviors.quack.Slient;
import java.strategy.behaviors.quack.Squeak;
import java.strategy.ducks.MallardDuck;
import java.strategy.ducks.ModelDuck;
import java.strategy.ducks.RedHeadDuck;
import java.strategy.ducks.RubberDuck;

/**
 * This is the Test class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 15:00
 */
public class Test {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("==============================================");

        RedHeadDuck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Quack());
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        System.out.println("==============================================");

        ModelDuck modelDuck = new ModelDuck(new FlyNoWay(), new Slient());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("==============================================");

        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("==============================================");

        System.out.println();
        makeRubberDuckFlyable(rubberDuck);
        rubberDuck.performFly();
    }

    private static void makeRubberDuckFlyable(RubberDuck rubberDuck) {
        System.out.println("Make rubber duck flyable!");

        rubberDuck.setFlyBehavior(new FlyWithRocket());
    }
}
