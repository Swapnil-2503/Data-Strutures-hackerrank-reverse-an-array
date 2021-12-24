import java.util.*;

public class Solution1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList b=new ArrayList<>();
        for(int i=0;i<a;i++){
            b.add(sc.nextInt());
        }
       // b.toString();
        Collections.reverse(b);
        for(int i=0;i<a;i++){
            System.out.print(b.get(i)+" ");
        }
    }
}