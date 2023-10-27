import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class ChatServiceTest {

    @Test
    fun setMesId() {
        val text = "1"
        val result = ChatService.senMessage(1,text)
        assertEquals(result, text)

    }//Создать новое сообщение.
}