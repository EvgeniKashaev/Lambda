

//Лямбды, extension-функции, операторы»
fun main() {
    ChatService.addMessaqes(Message(text = "1"))
    ChatService.addMessaqes(Message(text = "11"))

    ChatService.addMessaqes(Message(text = "2"))
    ChatService.addMessaqes(Message(text = "21"))


    println(ChatService.chat)



    //println(ChatService.x())



}

data class Message(
    val idUser: Int = 1,
    var idMessage: Int = ChatService.idMessage,
    val text: String,
    //val incoming: Boolean = true,
    //val readMessage: Boolean = true
)

data class DirectMessages(
    val idDirectMessages: Int = 1,
    val chats: MutableList<Message> = mutableListOf()
)

object ChatService {
    var idDirectMessage = 1
    var idMessage = 1


    val chat: MutableList<Message> = mutableListOf()
    val directMessage: MutableList<DirectMessages> = mutableListOf()


    fun addMessaqes(chats: Message) {
        idMessage++
        idDirectMessage++
        chat += chats.copy()
    }

    fun clear() {
        directMessage.clear()
        chat.clear()

    }
}
//Возможности для пользов