import java.util.*;
class symetrical{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    print("Enter the String: ");
    String str = sc.nextLine();
    print("Enter the length of the String: ");
    int len = sc.nextInt();
    int i = 0;
    int j = len - 1;
    while(i < j){
        if(str.charAt(i) != str.charAt(j)){
            println("Not Symmetrical");
            return;
        }
        i++;
        j--;
    }
    println("Symmetrical");
    
}
public static void print(String test){
    System.out.print(test);
}
public static void println(String test){
    System.out.println(test);
}
}