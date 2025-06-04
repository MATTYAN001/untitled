package textbooks_practice.chapter6.practice3;

import java.io.IOException;

public class Kouhan {
    public static void callDeae() {
        System.out.println("ええい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro()throws InterruptedException{
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(5000);
        Zenhan.doTogame();
    }
}
