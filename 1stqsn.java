import java.util.Scanner;
public class typeface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String s1=sc.nextLine();
        System.out.println("Enter the string2");
        String s2=sc.nextLine();
        Character king=s2.charAt(s2.length()-1);
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==king)
            {
                count++;
            }
        }
        System.out.println(count);
    }   
}
