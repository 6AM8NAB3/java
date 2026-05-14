package Notification_Service;

public class EmailSender implements MessageSender{
    private String message;

    public EmailSender(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
<<<<<<< HEAD
        System.out.println("이메일 발송중... / 내용: "+message+"\n");
=======
        System.out.println("이메일 발송중... / 내용: "+messageㅌㄴ);
>>>>>>> origin/main
    }
}
