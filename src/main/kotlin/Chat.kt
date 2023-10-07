import java.sql.Time
import java.util.*

data class Chat(
    val idChat: Int,
    val idUser: Int,
    val lakes: Int,
    val time: Time,
    val date: Date,
    val chats: MutableList<Message> = mutableListOf()
)
