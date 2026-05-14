package Notification_Service;

public class MessageSenderMain {
    public static void main(String[] args) {
        MessageSender[] message = {
                new KakaoTalkSender(""),
                new SmsSender(""),
                new EmailSender("")
        };
<<<<<<< HEAD
        String Notice = "오늘 오후 2시부터 서버 점검이 있을예정입니다\n이용불가 시간: 오후 2시 ~ 오후 6시\n감사합니다.";
=======
        String Notice = "\n오늘 오후 2시부터 서버 점검이 있을예정입니다\n이용불가 시간: 오후 2시 ~ 오후 6시\n감사합니다.";
>>>>>>> origin/main

        System.out.println("전체 알림 메세지 전송중..");
        System.out.println();

        for (MessageSender m: message) {
            m.sendMessage(Notice);
            System.out.println();
        }

        System.out.println("전체 알림 메세지 전송 완료");
    }
}
