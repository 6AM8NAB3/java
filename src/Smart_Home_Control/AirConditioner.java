package Smart_Home_Control;

class  AirConditioner implements RemoteControl {
    private int volume;

    public AirConditioner(int volume) {
        this.volume = volume;
    }
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("현재 TV 볼륩: "+volume);
    }
}
