import java.util.Scanner;

public class StringManipulationMain {
    public static void main(String[] args) {
        manipulateStrings();
    }

    static void manipulateStrings() {
        Scanner keyType = new Scanner(System.in);
        while (true) {
            printOptions();
            int selection = keyType.nextInt();
            keyType.nextLine();
            if (selection == 5) { //End program
                return;
            } else if (selection > 4) { //Invalid option
                System.out.println("Please choose a valid option.");
                continue;
            }
            System.out.println("Please type in your word(s).");
            String word = keyType.nextLine();
            switch (selection) {
                case 1: //RotationOf2
                    System.out.println(StringUtils.rotationOf2(word));
                    break;
                case 2: //Palindrome
                    System.out.println(StringUtils.palindrome(word));
                    break;
                case 3: //RepeatFront
                    System.out.println("Please input the amount of letters you would like to repeat.");
                    System.out.println(StringUtils.repeatFront(word, keyType.nextInt()));
                    keyType.nextLine();
                    break;
                case 4: //IsPrefixRepeated
                    System.out.println("Please input the prefix amount.");
                    System.out.println(StringUtils.prefixRepeated(word, keyType.nextInt()));
                    keyType.nextLine();
                    break;
                default: //InvalidChoice
                    System.out.println("Please choose a valid option");
                    break;
            }
        }
    }

    static void printOptions() { //Print available options
        System.out.println("Please input the number of the option chosen.");
        System.out.println("1. Rotation of 2");
        System.out.println("2. Palindrome");
        System.out.println("3. Repeat front");
        System.out.println("4. Repeated Prefix");
        System.out.println("5. Exit");
    }
}
