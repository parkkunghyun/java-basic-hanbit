package interfacePractice;

public class Television implements RemoteControl{
    private int volume = 0;

    @Override
    public void turnOn() {
        System.out.println("tv on");
    }

    @Override
    public void turnOff() {
        System.out.println("tv off");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VALUE) {
            this.volume = RemoteControl.MAX_VALUE;
        }else if (volume < RemoteControl.MIN_VALUE) {
            this.volume = RemoteControl.MIN_VALUE;
        }
        else {
            this.volume = volume;
        }
        System.out.println("volume : "+ this.volume);
    }
}
