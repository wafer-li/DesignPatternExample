package kotlin_example.command

object RemoteControler  {
    val commands: ArrayList<Command> = arrayListOf()

    fun buttonPress(i : Int) {
        commands[i].execute()
    }
}
