package stategy

interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I am fly with wings!")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I cannot fly!")
    }
}

class FlyWithRocket : FlyBehavior {
    override fun fly() {
        println("Now I am fly with rocket!")
    }
}
