package textbooks_practice.chapter5;

public class Practice2 {
    public static void main(String[] args) {
        String title = "わお", address = "ここ", text = "メッセージ文";
        email(title,address,text);
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("本件: " + title);
        System.out.println("本文: " + text);
    }
}
