package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{1,2,2,3,4,4,4};
        int target = 4;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
