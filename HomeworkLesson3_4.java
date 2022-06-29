public class HomeworkLesson3_4 {
    public static void main(String[] args){

        System.out.println(numbers(103281234));

    }
    public static int numbers(int num) {
        int min = 9, max = 0, res;
        while (num > 0) {
            if (num % 10 < min) {
                min = num % 10;
            }
            if (num % 10 > max) {
                max = num % 10;
            }
            num /= 10;

        }

        res = min + max;

        System.out.print("103281234" + " -> " + min + " + " + max + " = "); return res ;
    }

}