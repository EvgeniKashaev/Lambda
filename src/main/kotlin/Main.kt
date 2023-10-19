

//Лямбды, extension-функции, операторы»
fun main() {
    ChatService.addMessaqes(Message(idUser = 1, text = "1"))
    ChatService.addMessaqes(Message(idUser = 1, text = "11"))

    ChatService.addMessaqes(Message(idUser = 0, text = "2"))
    ChatService.addMessaqes(Message(idUser = 0, text = "21"))


    println(ChatService.chat)
    println(ChatService.filter)

    ChatService.filter()
}

data class Message(
    val idUser: Int,
    var idMessage: Int = ChatService.idMessage,
    val text: String,
    //val incoming: Boolean = true,
    //val readMessage: Boolean = true
)

data class DirectMessages(
    val idDirectMessages: Int = ChatService.idDirectMessage,
    val chats: MutableList<Message> = mutableListOf()
)

object ChatService {
    var idDirectMessage = 0
    var idMessage = 1


    val chat: MutableList<Message> = mutableListOf()
    val directMessage: MutableList<DirectMessages> = mutableListOf()


 //   val filter get() = chat.filter { index -> index.idUser == 1 }
    fun filter(message: Message, idDirectMessage: Int ): Message {
        val list = chat.filter  { index -> index.idUser == idDirectMessage }
        return list.last()
    }
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