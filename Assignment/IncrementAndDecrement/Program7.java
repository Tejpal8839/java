public class Program7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = a-- + ++b - b-- + ++a;
        System.out.println(c); // Output: 10
    }
}
