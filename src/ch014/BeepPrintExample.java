package ch014;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
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
        }, "beepThread");

        thread.start();
        System.out.println(thread.getName());

        for(int i =0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
            }
        }

    }
}
