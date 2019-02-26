        import java.util.Scanner;
        import java.lang.Math;

        public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(num < 1000 || num > 9999 ){
            System.out.println("Enter any four digit number");
            num = scan.nextInt();
        }
        int[] digits = new int[4];

        for(int i = 3;i >= 0; i--){
            digits[Math.abs(i - 3)] = (int) (((num / Math.pow(10, i)) % 10) + 7)%10;
        }
        String result = "" + digits[2] + digits[3] + digits[0] + digits[1];

        System.out.println(result);
    }
}
