import sun.security.ec.point.ProjectivePoint.Mutable

class ChatService() {
    val chats = mutableListOf<Message>()

    fun getUnreadChatsCount (chat: Message):Boolean { return chat.status } //TODO Видеть, сколько чатов не прочитано.
    fun getChats (id: Int, chat: Message) = chat.userId == id //    TODO Получить список чатов (например, service.getChats).
    fun getChatsId (id:Int, chats: Message): MutableList<String> {
        if (chats.userId == id){
            val chat = mutableListOf(chats.text)
            return chat
        }
        return null
 } //    TODO Получить список последних сообщений из чатов (можно в виде списка строк). Если сообщений в чате нет (все были удалены), то пишется «нет сообщений».
//    TODO Получить список сообщений из чата, указав: ID чата; ID последнего сообщения, начиная с которого нужно подгрузить более новые;После того как вызвана эта функция, все отданные сообщения автоматически считаются прочитанными.
//    TODO Создать новое сообщение.
//    TODO Удалить сообщение.
//    TODO Создать чат. Чат создаётся, когда пользователю отправляется первое сообщение.
//    TODO Удалить чат, т. е. целиком удалить всю переписку.
}//Возможности для пользователя: