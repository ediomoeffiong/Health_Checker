import java.util.Scanner;
public class Main {
    public static boolean isFound;
    public static boolean isFemale, isMale;
    public static boolean cough, vomiting, fatigue, headache, fever, chill, discomfort, nausea, pain, drowsiness;
    public static boolean dehydration, catarrh;
    public static boolean lost_appetite;
    public static void main(String[] args) {
        System.out.println("-------------------Health Checker-------------------");
        System.out.print("Enter your name: ");
        Scanner scanName = new Scanner(System.in);
        String userName = scanName.nextLine();
        System.out.println("\n");
        System.out.println("Hii, " + userName + " I hope you're doing good today.");
        System.out.println("\nWarning: Enter the correct details throughout this prompt!");
        System.out.print("Input your gender (male or female): ");
        Scanner scanGender = new Scanner(System.in);
        String userGender = scanGender.nextLine();
        if (userGender.equals("male") || userGender.equals("Male")) {
            isMale = true;
        } else {
            isFemale = true;
        }

        System.out.println("\nType in the symptoms you're are having separated by a comma and followed by a space.");
        System.out.println("\nHit enter when you're done");
        System.out.print("\nInput symptoms: ");
        Scanner scanSymptom = new Scanner(System.in);
        String userSymptom = scanSymptom.nextLine();
        String[] userSymptoms = userSymptom.split(", ");

        //Turns every element in the array to small letters
        for (int i = 0; i < userSymptoms.length; i++) {
            userSymptoms[i] = userSymptoms[i].toLowerCase();
        }

        System.out.println("\n");
        symptoms(userSymptoms);
    }

    public static void symptoms(String[] symptom) {
        for (String symptoms : symptom) {
            if (symptoms.equals("cough")) {
                cough = true;
            }
            if (symptoms.equals("fever")) {
                fever = true;
            }
            if (symptoms.equals("headache")) {
                headache = true;
            }
            if (symptoms.equals("vomiting") || symptoms.equals("vomit") || symptoms.equals("nausea")) {
                vomiting = true;
                nausea = true;
            }
            if (symptoms.equals("fatigue")) {
                fatigue = true;
            }
            if (symptoms.equals("chill")) {
                chill = true;
            }
            if (symptoms.equals("discomfort")) {
                discomfort = true;
            }
            if (symptoms.equals("pain")) {
                pain = true;
            }
            if (symptoms.equals("drowsiness")) {
                drowsiness = true;
            }
            if (symptoms.equals("lost appetite") || symptoms.equals("loss of appetite")) {
                lost_appetite = true;
            }
            if (symptoms.equals("dehydration")) {
                dehydration = true;
            }
            if (symptoms.equals("catarrh")) {
                catarrh = true;
            }
            if (symptoms.equals("vomit")) {
                vomiting = true;
            }
        }

        //Calling all methods
        while (!isFound) {
            malariaTest();
            pregnancyTest();
        }

    }

    public static void pregnancyTest() {
        int pregScore = 0;
        if (vomiting) {
            pregScore++;
        }
        if (fatigue) {
            pregScore++;
        }

        if (pregScore >= 1.4) {
            System.out.println("You are pregnant!");
        }
        isFound = true;
    }

    public static void malariaTest() {
        int malariaScore = 0;
        if (headache) {
            malariaScore++;
        }
        if (fever) {
            malariaScore++;
        }
        if (catarrh) {
            malariaScore++;
        }
        if (chill) {
            malariaScore++;
        }
        if (discomfort) {
            malariaScore++;
        }
        if (headache) {
            malariaScore++;
        }
        if (nausea) {
            malariaScore++;
        }
        if (vomiting) {
            malariaScore++;
        }
        if (drowsiness) {
            malariaScore++;
        }
        if (malariaScore >= 5) {
            System.out.println("You are having malaria");
        }
        isFound = true;
    }

    public static void notFound() {
        System.out.println("Oops! We can't find out what's wrong!");
        System.out.println("We advise that you seek a medical professional advice as soon as possible.");
    }
}