import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        System.out.println("1 Create file");
        System.out.println("2 Delete file");
        System.out.println("3 Rename file");
        System.out.println("4 Find word");
        System.out.println("5 Replace word");
        System.out.println("0 Exit");
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        while (flag == 1){
            System.out.println("Please choose your option (For example: '1')");
            int option = scanner.nextInt();
            if (option==0){
                flag = 0;
            }

            }
        }
    }