public class hukusyu19 {
    public static void main(String[] args) {
        int num = 4;
        int i = 2;
        int factorial = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("結果:" + factorial);
    }
}
