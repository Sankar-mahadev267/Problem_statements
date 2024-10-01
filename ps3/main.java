import java.util.*;
class main{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i%j==0){
            j=i;
        } 
        else{
            j=j*(i/j+1);
        }
        System.out.println(j);
    }
}