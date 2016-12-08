package kotlin_example.decorator

/**
 * This is the Test class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 16/12/8 12:58
 */

fun main(args: Array<String>) {
    val coffee: Beverage = Whip(Mocha(Soy(Milk(Milk(Soy(DarkRoast()))))))

    println(coffee.description)
    println("%.2f".format(coffee.cost()))
}
