package stategy

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

class Slient : QuackBehavior {
    override fun quack() {
        println("I cannot quack!")
    }
}


