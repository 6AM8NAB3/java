package Notification_Service;

public class EmailSender implements MessageSender{
    private String message;

    public EmailSender(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("이메일 발송중... / 내용: "+messageㅌㄴ);
    }
}
