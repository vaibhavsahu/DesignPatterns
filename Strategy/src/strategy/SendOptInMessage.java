package strategy;

public class SendOptInMessage implements SendMessage{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending OptIn Message " + message);
    }
}
