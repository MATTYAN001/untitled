public class hukusyu23 {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("結果:" + factorial);
    }
}
