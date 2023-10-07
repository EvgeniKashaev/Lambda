//Лямбды, extension-функции, операторы»
fun main() {
    ChatService.addMessaqes(Message(text = "1"),ChatService.addDirectMessages())
    ChatService.addMessaqes(Message(text = "2"), ChatService.addDirectMessages())
    ChatService.addMessaqes(Message(text = "3"), ChatService.addDirectMessages())
    ChatService.addMessaqes(Message(text = "4"), ChatService.addDirectMessages())

    println(ChatService.directMessage)

}

data class Message(
    var idMessage: Int = ChatService.idMessage,
    val text: String,
    val incoming: Boolean = true,
    val readMessage: Boolean = true
)

data class DirectMessages(
    val idDirectMessages: Int = ChatService.idDirectMessages,
    val chat: MutableList<Message> = ChatService.chats
)


object ChatService {
    var idDirectMessages = 0
    var idMessage = 1

    val chats: MutableList<Message> = mutableListOf()
    val directMessage: MutableList<DirectMessages> = mutableListOf()


    val addDirectMessages = fun(): DirectMessages {
        idDirectMessages++
        directMessage += DirectMessages().copy()
        return directMessage.last()
    }

    val addMessaqes = fun(message: Message,addDirectMessages: DirectMessages): Message {
        idMessage++
        chats += message.copy()
        return chats.last()
    }

    // Можно создавать чаты,
// удалять их,
// получать список имеющихся чатов.
    fun clear() {
        //  directMessages.clear()
        chats.clear()
    }
}
//Возможности для пользов