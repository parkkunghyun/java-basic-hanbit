package ch014;

public class MainThreadExample {
    public static void main(String[] args) {
        System.out.println("시작");
        Thread currThread = Thread.currentThread();
        // 현재 스레드의 객체를 리턴!
        // Thread currThread2 = null; 이건 예외!
        System.out.println(currThread.getName());
        System.out.println("종료");
    }
}
