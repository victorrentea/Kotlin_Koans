fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
//    if (message == null) return;
    message?.let { m ->
        client?.personalInfo?.email?.let { email -> mailer.sendMessage(email, m) }
    }
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
