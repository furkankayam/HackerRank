import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(1<=N && N<=100) {
            if(N%2 == 1) {
                System.out.println("Weird");
            }else {

                if(2<=N && N<=5) {
                    System.out.println("Not Weird");
                }
                else if(6<=N && N<=20) {
                    System.out.println("Weird");
                }
                else if(20<N) {
                    System.out.println("Not Weird");
                }

            }
        }

        bufferedReader.close();
    }
}