import java.util.Scanner;
import java.lang.String;

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String stroka1 = in.nextLine();
//        String[] words = stroka1.split(" ");
//        int k = 0;
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].toLowerCase().startsWith("a") || (words[i].toLowerCase().startsWith("e") || (words[i].toLowerCase().startsWith("i") || (words[i].toLowerCase().startsWith("y")))) || (words[i].toLowerCase().startsWith("u")) || (words[i].toLowerCase().startsWith("o")) || (words[i].toLowerCase().startsWith("а")) || (words[i].toLowerCase().startsWith("е")) || (words[i].toLowerCase().startsWith("ё")) || (words[i].toLowerCase().startsWith("и")) || (words[i].toLowerCase().startsWith("о")) || (words[i].toLowerCase().startsWith("у")) || (words[i].toLowerCase().startsWith("ы")) || (words[i].toLowerCase().startsWith("э")) || (words[i].toLowerCase().startsWith("ю")) || (words[i].toLowerCase().startsWith("я"))) {
//                k++;
//            }
//        }
//        System.out.println("Количество слов, начинающихся с гласной буквы: " + k);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку: ");
//        String stroka2 = in.nextLine();
//        int k = 0;
//        int n = 1;
//        System.out.print("Номера слов, имеющих длину 3: ");
//
//        char[] chArray = stroka2.toCharArray();
//        for (int i = 0; i < stroka2.length(); i++) {
//            if (chArray[i] != ' ') {
//                k++;
//            } else {
//                n++;
//                k = 0;
//            }
//            if (i + 1 < stroka2.length()) {
//                if ((k == 3) && (chArray[i + 1] == ' ')) {
//                    k = 0;
//                    System.out.print(n + " ");
//                }
//            }
//            if ((k == 3) && (i + 1 == stroka2.length())) {
//                k = 0;
//                System.out.print(n + " ");
//            }
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka3 = in.nextLine();
        int k = 0;
        int max = 0;
        String n = " ";
        String maxn = " ";

        char[] chArray = stroka3.toCharArray();
        for (int i = 0; i < stroka3.length(); i++){
            if (chArray[i] != ' '){
                k++;
                n = n + chArray[i];
            } else{
                k = 0;
                n = " ";
            }
            if (k >= max){
                max = k;
                maxn = n;
            }
        }
        System.out.println("Последнее слово максимальной длины: " + maxn);
    }
}