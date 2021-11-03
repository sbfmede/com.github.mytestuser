public class MainClass {
    public static void main(String[] args) {

        int a =13;
        int b =15;
        int sum;

        sum = getSum(a,b);
        System.out.println(sum);
        sum = getSum(17,73);
        System.out.println(sum);
        showSum(10,11,54);
        showSum(32,42,0);

        saySomething();

    }

    static int getSum(int x, int y) {
        int sum = x+y;
        return sum;
    }

    static  void showSum(int q, int w, int e) {
        int sum = (q+w)*e;
        System.out.println("the result is " + sum);
    }

    static void saySomething(){
        System.out.println("HEllo!");
    }
}
