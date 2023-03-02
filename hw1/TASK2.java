import java.util.Scanner;
public class TASK2 {
    public static void main(String[] args) {
        System.out.println(reverseWords());

    }
    public static String reverseWords() {
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();

        userString = userString.trim().replaceAll("( )+", " ");
        String[] userWords = userString.split(" ");
        String reversedWords;
        reversedWords = "";

        for (int i = userWords.length-1; i >= 0; i--) {

            reversedWords += userWords[i];
            if(i!=0){
                reversedWords += " ";
            }
        } return reversedWords;
    }


}

//        if(userString.charAt(0) == ' ' ){
//            userString= userString.substring(1,userString.length());
//        }
//
//       if(userString.charAt(userString.length()-1) == ' ') {
//           userString = userString.substring(0, userString.length() - 1);
//       }
