package kotlin_example.decorator

/**
 * This is the Componet class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/12/8 12:39
 */

abstract class Beverage {
    open val description: String = "Unknown Beverage"

    abstract fun cost(): Double
}

class HouseBlend : Beverage() {
    override val description: String = "House Blend"

    override fun cost(): Double {
        return 1.2
    }
}

class DarkRoast : Beverage() {

    override val description: String = "Dark Roast"

    override fun cost(): Double {
        return 2.2
    }
}

class Espresso : Beverage() {

    override val description: String = "Espresso"

    override fun cost(): Double {
        return 1.5
    }

}

class Decaf : Beverage() {

    override val description: String = "Decaf"

    override fun cost(): Double {
        return 1.8
    }
}
