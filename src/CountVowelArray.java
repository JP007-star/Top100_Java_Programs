import java.util.Scanner;

public class CountVowelArray {
    public static void main(String[] args) {
        //Scanner Obj Initialized
        Scanner scanner=new Scanner(System.in);

        //prompt  string  from user
        System.out.println("Enter a String:");
        String string=scanner.next();
        char charArray[]=string.toCharArray();
        int vowel=0;
        for(int i=0;i<charArray.length;i++){
            if(string.charAt(i)=='a'||string.charAt(i)=='e'|| string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'||
                    string.charAt(i)=='A'||string.charAt(i)=='E'|| string.charAt(i)=='I'||string.charAt(i)=='O'||string.charAt(i)=='U'){
                vowel++;
            }
        }
        System.out.println("No of Vowels Present in this String :"+vowel);
    }
}
