package kotlin_example.decorator

/**
 * This is the Decorator class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/12/8 12:47
 */

abstract class CondimentDecorator : Beverage() {
    abstract override val description: String
}

class Milk(val beverage: Beverage) : CondimentDecorator() {
    override val description: String
        get() = beverage.description + " Milk"

    override fun cost(): Double {
        return beverage.cost() + .12
    }
}

class Mocha(val beverage: Beverage) : CondimentDecorator() {
    override val description: String
        get() = beverage.description + " Mocha"

    override fun cost(): Double {
        return beverage.cost() + .2
    }
}

class Soy(val beverage: Beverage) : CondimentDecorator() {
    override val description: String
        get() = beverage.description + " Soy"

    override fun cost(): Double {
        return beverage.cost() + .15
    }

}

class Whip(val beverage: Beverage) : CondimentDecorator() {
    override val description: String
        get() = beverage.description + " Whip"

    override fun cost(): Double {
        return beverage.cost() + .13
    }
}
