package Notification_Service;

public class KakaoTalkSender implements MessageSender{
    private String message;

    public KakaoTalkSender(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("카톡 알림톡 전송중... / 내용: "+message);
    }
}
