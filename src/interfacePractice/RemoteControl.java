package interfacePractice;

public interface RemoteControl {
    public static final int MAX_VALUE = 10;
    public static final int MIN_VALUE = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

}
