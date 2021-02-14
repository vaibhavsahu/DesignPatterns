import strategy.SendMessage;
import strategy.SendOptInMessage;
import strategy.SendOptOutMessage;

public class Main {
    public static void main(String[] args) {
        SendMessage sendOptInMessage = new SendOptInMessage();
        SendMessage sendOptOutMessage = new SendOptOutMessage();

        MessageSenderClient client = new MessageSenderClient();
        client.sendMessageUsingClient(sendOptInMessage, "test");
        client.sendMessageUsingClient(sendOptOutMessage, "test");
    }
}
