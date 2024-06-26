import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------Health Checker-------------------");
        System.out.print("Enter your name: ");
        Scanner scanName = new Scanner(System.in);
        String userName = scanName.nextLine();
        System.out.println("\n");
        System.out.println("Hii, " + userName + " I hope you're doing good today.");
        System.out.println("Warning: Enter the correct details throughout this prompt!");
        System.out.println("Type in the symptoms you're are having separated by a comma and followed by a space.");
        System.out.println("Hit enter when you're done");
        System.out.print("Symptoms: ");
        Scanner scanSymptom = new Scanner(System.in);
        String userSymptom = scanSymptom.nextLine();
        String[] userSymptoms = userSymptom.split(", ");
        for (String symptom : userSymptoms) {
            System.out.println(symptom);
        }
    }
}