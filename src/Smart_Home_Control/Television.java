package Smart_Home_Control;

class Television implements RemoteControl {
    private int volume;

    public Television(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("에어컨은 볼륨기능이 없어요.. :(");
    }
}
