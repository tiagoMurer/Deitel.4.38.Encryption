import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String numString ="";
        while(numString.length() != 4) {
            System.out.println("Enter any four digits");
            numString = scan.nextLine();
        }

        int[] num = new int[4];

        for(int i = 0; i < 4; i++){
            int n  = numString.charAt(i) - '0';
            if(n < 7){
                n += 10;
            }
            n -= 7;
            num[i] = n;
        }

        String result = "" + num[2] + num[3] + num[0] + num[1];
        System.out.println(result);
    }
}
