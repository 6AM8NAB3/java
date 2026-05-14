package Smart_Home_Control;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl[] Remotes = {
            new AirConditioner(10),
                new Television(10)
        };

        System.out.println("---------------------");

        for (RemoteControl r : Remotes){
            r.turnOn();
            r.turnOff();
            r.setVolume(5);
            System.out.println("---------------------");
        }
    }
}
