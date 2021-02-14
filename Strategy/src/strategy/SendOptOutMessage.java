package strategy;

public class SendOptOutMessage implements SendMessage{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending OptOut Message: " + message);
    }
}
