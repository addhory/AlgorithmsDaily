import java.util.Scanner;
import java.util.regex.Pattern;

/*

Author : Muhammad Ridho Anshory
College : Kalimantan Institute of Technology
Year/Department : 2017/Information System
E-Mail Id : muhridhoanshory@gmail.com

Insert Your Code Here
*/

public class Java_xxridhohero11 {
    // Method to reverse words of a String
    static String reverseWords(String str)
    {

        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    // Driver methods to test above method
    public static void main(String[] args)
    {
        String sentence;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your sentence to reverse it");
        sentence = in.nextLine();
        System.out.println(reverseWords(sentence));

        String s2 = "I love Java Programming.";
        System.out.println(reverseWords(s2));
    }
}
