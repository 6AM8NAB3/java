package kiosk;

public class KioskMain {
    public static void main(String[] args) {
        KioskSystem[] kiosk = new KioskSystem[2];
        kiosk[0] = new Coffee(4500,"아메리카노");
        kiosk[1] = new Dessert(5000,"딸기 타르트");

        System.out.println("\n---메뉴 설명칸---");
        for (KioskSystem item : kiosk) {  // kiosk라는 이름의 배열(혹은 리스트)에 들어있는 요소들을 하나씩 꺼내서 item이라는 변수에 담고 반복하겠다는 뜻
            item.description();
        }
        System.out.println("\n--- 주문 진행 ---");
        ((Coffee)kiosk[0]).order(); // kiosk[0]은 부모 타입이라 자식만 가진 특별한 기능(order)을 바로 쓸 수 없어서 자식 타입을 표시해야함
        ((Dessert)kiosk[1]).order();

        KioskSystem.showTotalSales();
    }
    }


