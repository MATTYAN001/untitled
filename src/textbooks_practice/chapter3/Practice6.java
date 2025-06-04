package textbooks_practice.chapter3;

import java.io.*;
public class Practice6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("【数あてゲーム】");
        int ans = (int)(Math.random() * 10);
        for (int i = 0; i < 5; i++) {
            System.out.print("0～9までの数字を入力してください>");
            int num = Integer.parseInt(br.readLine());
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            }else{
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
