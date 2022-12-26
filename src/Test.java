import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    int N;
    public void number() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter Nth number");
            N = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<Integer>();
            for (int i = 1; i <= N; i++) {
                even.add(i);
            }
            int sum = 0;
            for (int s : even) {
                int count = (s + "").length();
                if (((count + 1) % 2) == 0) {
                    sum += (2 * count);
                } else if (count % 2 == 0 && count % 4 != 0) {
                    sum += (3 * count);
                } else if (count % 2 == 0 && count % 4 == 0) {
                    sum += (4 * count);
                }
            }
            int result = 0;
            for (int i = 0; sum != 0; i++) {
                result += sum % 10;
                sum = sum / 10;
            }
            System.out.println("Hey user, Result for provided range is : " + result);
        }
    }
}
