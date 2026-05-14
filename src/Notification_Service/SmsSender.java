package Notification_Service;

public class SmsSender implements MessageSender{
    private String message;

    public SmsSender(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("sms 문자 메세지 전송중... / 내용: "+message+"\n");
    }
}
