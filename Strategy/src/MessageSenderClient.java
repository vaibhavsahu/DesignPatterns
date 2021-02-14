import strategy.SendMessage;

public class MessageSenderClient {

    public void sendMessageUsingClient(SendMessage sendMessage, String message){
        sendMessage.sendMessage(message);
    }
}
