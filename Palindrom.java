import java.io.*;
class Palindrom
{
    public static void main(String args[])throws IOException
    {
        int num,rev=0,copy;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the 4 Digit no:");
        num=Integer.parseInt(br.readLine());
        copy=num;
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        num=num/10;
        rev=(num%10)+(rev*10);
        if(rev==copy)
            System.out.print(rev+"is a Polindrom");
        else
            System.out.print(rev+"is not a polindrom");
    }
}