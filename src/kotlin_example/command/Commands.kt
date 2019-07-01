package kotlin_example.command

interface Command {
    fun execute()
}

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }

}