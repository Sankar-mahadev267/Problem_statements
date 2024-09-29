import java.util.*;
class main{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int org=sc.nextInt();
        int rev=10*(org%10)+(org/10);
        System.out.println(org+rev);
    }
}