package ch014;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            // 자식클래스로 정의해서 만드는 방식임!
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i =0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000); // 1
                    }catch (InterruptedException e) {
                    }
                }
            }
        };

        thread.start();
        System.out.println(thread.getName());

        // 직접 생성!
        Thread printThread = new Thread(new Task());
        printThread.start();
        System.out.println(printThread.getName());
    }
}
