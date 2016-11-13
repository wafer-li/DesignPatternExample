package kotlin_example.stategy

open class Duck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior)
{
    open fun display() {
        println("I am a normal duck")
    }

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }
}

class MallardDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) :
        Duck(flyBehavior, quackBehavior) {
    override fun display() {
        println("I am a mallard duck")
    }
}

class ReadHeadDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) :
        Duck(flyBehavior, quackBehavior) {
    override fun display() {
        println("I am a red head duck")
    }
}

class RubberDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) :
        Duck(flyBehavior, quackBehavior) {
    override fun display() {
        println("I am a rubber duck")
    }
}

class ModelDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) :
        Duck(flyBehavior, quackBehavior) {
    override fun display() {
        println("I am a model duck")
    }
}
