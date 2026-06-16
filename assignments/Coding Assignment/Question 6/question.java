import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentData = sc.nextInt();
        int newPackData = sc.nextInt();
        int carriedData;
        if(currentData  <= 2){
            carriedData = currentData;
        }else{
            carriedData = 2;
        }
        int finalData = carriedData + newPackData;
        System.out.println(finalData);
        sc.close();
    }
}