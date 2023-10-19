//Лямбды, extension-функции, операторы»
data class Message(var messId: Int = 1, val text: String, var read: Boolean = false)
data class Chat(val messages: MutableList<Message> = mutableListOf())
class ChatNotFoundException : Exception()
object ChatService {

    private val chats = mutableMapOf<Int, Chat>()
    var mesId: Int = 0
    fun senMessage(userId: Int, message: String) {
        mesId++
        chats.getOrPut(userId) {
            Chat()
        }.messages += Message(mesId, message)

    } // Создать новое сообщение.

    fun getListOfMessages(userId: Int, count: Int): List<Message> {
        val chat = chats[userId] ?: throw ChatNotFoundException()
        return chat.messages.takeLast(count).onEach {
            it.read = true
        }
    }  //  Получить список сообщений из чата, указав:

    fun getLastMessages(): List<String> = chats.values.map {
        it.messages.lastOrNull()?.text ?: "Нет сообщений"
    } // Получить список последних сообщений из чатов

    fun getChats(): MutableMap<Int, Chat> {
        return (chats) // Получить список чатов
    }

    fun getUnreadChatsCount() = chats.values.count { chat: Chat ->
        chat.messages.any {
            !it.read
        }
    } // Видеть, сколько чатов не прочитано

    fun deleteMessage(chatId: Int, messageId: Int) = chats[chatId]?.messages?.remove(chats[chatId]?.messages?.find {
        it.messId == messageId
    })//Удалить сообщение.

    fun deleteChat(userId: Int) = chats.remove(userId) //Удалить чат, т. е. целиком удалить всю переписку.

}

fun main() {

}