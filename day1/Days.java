import java.util.*;
class Days{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int years=days/365;
        days=days%365;
        int months=days/30;
        days=days%30;
        System.out.println(years+" "+months+" "+days);
    }
}