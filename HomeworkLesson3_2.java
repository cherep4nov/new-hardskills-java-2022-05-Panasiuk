public class HomeworkLesson3_2 {
    public static void main (String... args){
        int[] array = {0, 4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
        for (int i = 0; i < array.length; i++)
            if (array[i] % 5 == 0)
                System.out.println(array[i]);
    }
}
