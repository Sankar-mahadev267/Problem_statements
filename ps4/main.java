import java.util.*;
class main{
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int min=sc.nextInt();
        int hrs=min/60;
        min=min%60;
        int days=hrs/24;
        hrs=hrs%24;
        System.out.println(days+" "+hrs+" "+min);
    }
}