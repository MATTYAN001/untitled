package textbooks_practice.chapter4;

import java.io.*;
public class Practice4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = {3,4,9};
        System.out.print("1桁の数字を入力してください>");
        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                System.out.println("アタリ！");
            }
        }
    }
}
