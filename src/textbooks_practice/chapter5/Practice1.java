package textbooks_practice.chapter5;

import java.io.*;
public class Practice1 {
    public static void main(String[] args)throws IOException  {
        introduceOneself();
    }
    public static void introduceOneself()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        double height = Double.parseDouble(br.readLine());
        char gender = br.readLine().charAt(0);
        System.out.println("私の名前は" + name + "です。歳は" + age + "歳です。身長は" + height + "です。");
        System.out.println("十二支は" + gender + "です。");
    }
}
