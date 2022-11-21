import java.util.ArrayList;
import java.util.Scanner;
class stqsn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0)
        {
            int temp=n%3;
            list.add(temp);
            n=n/3;
        }
        int a[]=new int[list.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=list.get(a.length-i-1);
        }
        String s1="";
        for(int i=0;i<a.length;i++)
        {
            s1=s1+a[i];
        }
        int k=Integer.valueOf(s1);
        System.out.println(k);
    }
}
