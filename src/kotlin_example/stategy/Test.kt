package kotlin_example.stategy

/**
 * This is the Test class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/11/13 13:04
 */

fun main(args: Array<String>) {
    val mallardDuck: MallardDuck = MallardDuck(FlyWithWings(), Quack())
    mallardDuck.display()
    mallardDuck.performFly()
    mallardDuck.performQuack()
    println("=================================================")

    val redHeadDuck: ReadHeadDuck = ReadHeadDuck(FlyWithWings(), Quack())
    redHeadDuck.display()
    redHeadDuck.performFly()
    redHeadDuck.performQuack()
    println("=================================================")

    val modelDuck: ModelDuck = ModelDuck(FlyNoWay(), Slient())
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.performQuack()
    println("=================================================")

    val rubberDuck: RubberDuck = RubberDuck(FlyNoWay(), Squeak())
    rubberDuck.display()
    rubberDuck.performFly()
    rubberDuck.performQuack()
    println("=================================================")

    println()
    makeRubberFlyable(rubberDuck)
    rubberDuck.performFly()
}

fun makeRubberFlyable(rubberDuck: RubberDuck) {

    println("Make Rubber Duck Flyable!")

    rubberDuck.flyBehavior = FlyWithRocket()
}
