public class JavaMethod {
    public static class TextMessage{
        String Bart = "Where are you? ";
        String Lisa="I am at school!";
    }
    public static void PrintA(){
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println();
        System.out.println();
    }public static void PrintV(){
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" *   *");
        System.out.println("  * *");
        System.out.println("   *");
        System.out.println();
        System.out.println();
    }public static void PrintJ(){
        System.out.println("    *");
        System.out.println("    *");
        System.out.println("    *");
        System.out.println("*   *");
        System.out.println("*****");
        System.out.println();
        System.out.println();
    }public static void Multiply(int x, int y){
        System.out.println(x*y);
    }public static void Add10(int a){
        System.out.println(a+10);
    }public static void CountDown(int b){
        for (int i = b; i > -1; i--) {
            System.out.println(i);
        }
    }public static void Echo(String x, int y){
        for (int i = 0; i < 4; i++) {
            System.out.println(x);
        }
    }public static int doubleNumber(int x) {
        return 2 * x;
    }public static int square(int x) {
        return x*x;
    }public static int average(int x, int y) {
        return (x*y)/2;
    }public static boolean inRange(int num, int min, int max) {
        return num>= min && num<= max;
    }public static int sumFrom(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum+=i;
        }
        return sum;
    }public static boolean isDivisible(int a, int b){
        return a%b==0;
    }public static double fahrenheitToCelsius(double degrees){
        return (5.0/9) * (degrees-32);
    }public static void main(String[] args) {

        PrintJ();
        PrintA();
        PrintV();
        PrintA();
        /*
        Multiply(2,20);
        Multiply(5, 19);
        Multiply(100, 15);
        Add10(1);
        Add10(100);
        Add10(-50);
        CountDown(3);
        CountDown(5);
        Echo("Why you bully me!", 50);
        int x = doubleNumber(45);
        System.out.println(x);
        int y = square(13);
        System.out.println(y);
        int z = average(x,y);
        System.out.println(z);
        System.out.println(inRange(5,4,9));
        System.out.println(sumFrom(5,23));
        System.out.println(isDivisible(30,6));
        System.out.println(fahrenheitToCelsius(120.37));


        TextMessage text1 = new TextMessage();
        System.out.println(text1.Bart + text1.Lisa);

 */
    }
}
