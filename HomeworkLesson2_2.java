public class HomeworkLesson2_2 {
    static long employee_salary = 1_850;

    public static void main(String[] args){
        getTaxes(employee_salary);
    }
    public static void getTaxes(long salary) {
        double taxes = 0.13 + 0.01;
        salary *= taxes;
        System.out.println(employee_salary - salary);
    }
}
