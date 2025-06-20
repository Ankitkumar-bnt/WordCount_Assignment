import java.util.Scanner;

public class DigitToWord{
    public static String ones[] ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
    public static String tens[] ={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty","Hundred"};
   
    public static int digitCount(int num)
    {
        int count=1;
        while(num>0)
        {
            num/=10;
            count*=10;
        }
        return count;
    }
    public static String getInWord(int digit)//54321 //59812651 //564
    {
        // int count = digitCount(digit);
        String str = "";
        int temp = digit;

            if(temp>=10000)
            {
                int temp2=temp;
                int rem = temp2 % 10000;
                int div = temp2/10000;
                rem = rem/1000;
                str = tens[div]+" "+ones[rem]+" Thousand ";
                temp%=1000;
            }
           
            if(temp>=100)
            {
                int rem = temp % 100;
                str = str + ones[rem]+ " Hundred ";

                rem = temp % 10;
                str = str + ones[rem];
                rem = temp / 10;
                str = tens[rem]+" "+str;
            }
        return str;
    }

    public static String getDecimalInWord(int decimals)
    {
         String str = "";
        
        int rem = decimals % 10;
        str = str + ones[rem];
        rem = decimals / 10;
        str = tens[rem]+" "+str;
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        double digit = sc.nextDouble();

        String s = getInWord((int)digit);

        String ss = getDecimalInWord((int)((digit-(int)digit)*100));
        s = s+" and "+ss+" Paisa";
        System.out.println(s);
        sc.close();
    }
}