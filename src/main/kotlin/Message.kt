val directMessages = mutableListOf<Message>()

class Message(
    var text: String, var idMessage: Int = 1, var userId: Int, var unread: Boolean = true, val inbox: Boolean = true
) {
    val directMessages = mutableListOf<Message>()
    fun createAChat(idUser: Int, text: String, message: Message) {
        message.text = text
        message.idMessage++
        message.userId = idUser
    }//Должны быть чаты. Чат — это общение с одним человеком, так называемые direct messages.

    val deleteСhatId = fun(id: Int, message: Message) = message.userId == id
    val deleteСhat = directMessages.filter(fun ((message: Message) = message.userId == 0))

}

//Можно создавать чаты, удалять их, получать список имеющихся чатов.
//В каждом чате есть сообщения от 1 до нескольких (см. раздел ниже).
//Можно создавать сообщения, редактировать их и удалять. Для простоты — можно удалять и свои, и чужие.
//В каждом чате есть прочитанные и непрочитанные сообщения.
