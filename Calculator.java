import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("List of operations: add, subtract, multiply, divide, and alphabetize.");
        System.out.println("Enter an operation: ");
        
        String operation = input.nextLine();
        operation = operation.toLowerCase();

        String operationOption;

        switch (operation) {
            case "add":
                operationOption = "Enter two integers: ";
                System.out.println(operationOption);
                while (input.hasNextInt()){
                    int add1 = input.nextInt();
                    int add2 = input.nextInt();
                    System.out.println("Answer: " + (add1 + add2));
                    return;
                }
                
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    return;
                }
                break;

            case "subtract": 
                operationOption = "Enter two integers: ";
                System.out.println(operationOption);
                while (input.hasNextInt()){
                    int sub1 = input.nextInt();
                    int sub2 = input.nextInt();
                    System.out.println("Answer: " + (sub1 - sub2));
                    return;
                }
                if (!input.hasNextInt()){
                    System.out.println("Invalid input entered. Terminating...");
                    return;
                }
                break;

            case "multiply":  //use printf
                operationOption = "Enter two doubles: ";
                System.out.println(operationOption);
                while (input.hasNextDouble()){
                    double mult1 = input.nextDouble();
                    double mult2 = input.nextDouble();
                    System.out.printf("Answer: %.2f\n", (mult1 * mult2));
                    return;
                }
                if (!input.hasNextDouble()){
                    System.out.println("Invalid input entered. Terminating...");
                    return;
                }
                break;

            case "divide":  //can't divide by 0
                operationOption = "Enter two doubles: ";
                System.out.println(operationOption);
                while (input.hasNextDouble()){
                    double div1 = input.nextDouble();
                    double div2 = input.nextDouble();
                    if (div2 != 0) {
                        System.out.printf("Answer: %.2f\n", (div1 / div2));
                        return;
                    }
                    else {
                        System.out.printf("Invalid input entered. Terminating...\n");
                        return;
                    }
                }
                if (!input.hasNextDouble()){
                    System.out.println("Invalid input entered. Terminating...");
                    return;
                }
                break;

            case "alphabetize": //compareto
                operationOption = "Enter two words:";
                System.out.println(operationOption);
                String word1 = input.next();
                String word2 = input.next();
                String wordLo1;
                String wordLo2;
                wordLo1 = word1.toLowerCase();
                wordLo2 = word2.toLowerCase();
                if (wordLo1.compareTo(wordLo2) < 0) {
                    System.out.println("Answer: " + word1 + " comes before " + word2 + " alphabetically.");
                }
                else if (wordLo1.compareTo(wordLo2) > 0) {
                    System.out.println("Answer: " + word2 + " comes before " + word1 + " alphabetically.");
                }
                else {
                    System.out.println("Answer: Chicken or Egg.");
                }
                break;

            default:
                operationOption = "Invalid input entered. Terminating...";
                System.out.println(operationOption);
                break;

        }
        
    }
}