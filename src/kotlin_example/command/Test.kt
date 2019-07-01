package kotlin_example.command

fun main() {
    val light = Light()
    RemoteControler.commands.add(LightOnCommand(light))
    RemoteControler.buttonPress(0)
    RemoteControler.commands.add(LightOffCommand(light))
    RemoteControler.buttonPress(1)
}
