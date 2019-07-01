package kotlin_example.stategy

interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        println("I am quacking!")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        println("I am squeaking!")
    }
}

class Silent : QuackBehavior {
    override fun quack() {
        println("I cannot quack!")
    }
}


