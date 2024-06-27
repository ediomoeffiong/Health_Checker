import java.util.Scanner;
public class Main {
    public static boolean isFound;
    public static boolean isFemale, isMale;
    public static boolean cough, vomiting, fatigue, headache, fever, chill, discomfort, nausea, pain, drowsiness;
    public static boolean dehydration, catarrh, jointPain, highBP, skinChanges, difficultySwallowing, bloating;
    public static boolean lostAppetite, bleeding, sweating, weightLoss;
    public static String userName, answer;
    public static int malariaScore, pregScore, cancerScore, obesityScore;
    public static void main(String[] args) {
        System.out.println("-------------------Health Checker-------------------");
        System.out.print("Enter your name: ");
        Scanner scanName = new Scanner(System.in);
        userName = scanName.nextLine();
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

        System.out.println("\n" + userName + ", it is important to note that this health checker");
        System.out.println("is not a substitute for professional medical advice.");
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
            if (symptoms.equals("cough") || symptoms.equals("coughing")) {
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
                lostAppetite = true;
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
            if (symptoms.equals("joint pain")) {
                jointPain = true;
            }
            if (symptoms.equals("high blood pressure") || symptoms.equals("high bp")) {
                highBP = true;
            }
            if (symptoms.equals("skin changes")) {
                skinChanges = true;
            }
            if (symptoms.equals("difficulty swallowing") || symptoms.equals("swallowing difficulty")) {
                difficultySwallowing = true;
            }
            if (symptoms.equals("bloating")) {
                bloating = true;
            }
            if (symptoms.equals("bleeding")) {
                bleeding = true;
            }
            if (symptoms.equals("sweating") || symptoms.equals("sweat")) {
                sweating = true;
            }
            if (symptoms.equals("weight loss") || symptoms.equals("loss in weight")) {
                weightLoss = true;
            }
        }

        //Calling all methods
        malariaTest();
        pregnancyTest();
        obesityTest();
        cancerTest();
        if (!isFound) {
            notFound();
        }

    }

    public static void pregnancyTest() {
        pregScore = 0;
        if (vomiting) {
            pregScore++;
        }
        if (fatigue) {
            pregScore++;
        }

        if ((pregScore >= 1.4) && isFemale) {
            System.out.println("You are pregnant!");
            isFound = true;
        }
    }

    public static void malariaTest() {
        malariaScore = 0;
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
            System.out.println("You are may be having malaria.");
            System.out.println("Please answer the following questions to confirm: \n\n");
            malariaConfirm();
            isFound = true;
        }
    }

    public static void malariaConfirm () {
        if (!headache) {
            System.out.print("Are you having headache (Yes/No): ");
            question();
            if (answer.equals("1")) {
                headache = true;
                malariaScore++;
            }
        }
        if (!fever) {
            System.out.print("Are you having fever (Yes/No): ");
            question();
            if (answer.equals("1")) {
                fever = true;
                malariaScore++;
            }
        }
        if (!catarrh) {
            System.out.print("Are you having catarrh (Yes/No): ");
            question();
            if (answer.equals("1")) {
                catarrh = true;
                malariaScore++;
            }
        }
        if (!chill) {
            System.out.print("Are you having chill (Yes/No): ");
            question();
            if (answer.equals("1")) {
                chill = true;
                malariaScore++;
            }
        }
        if (!discomfort) {
            System.out.print("Are you having discomfort (Yes/No): ");
            question();
            if (answer.equals("1")) {
                discomfort = true;
                malariaScore++;
            }
        }
        if (!nausea) {
            System.out.print("Are you having nausea (Yes/No): ");
            question();
            if (answer.equals("1")) {
                nausea = true;
                malariaScore++;
            }
        }
        if (!vomiting) {
            System.out.print("Are you vomiting (Yes/No): ");
            question();
            if (answer.equals("1")) {
                vomiting = true;
                malariaScore++;
            }
        }
        if (!drowsiness) {
            System.out.print("Are you having drowsy (Yes/No): ");
            question();
            if (answer.equals("1")) {
                drowsiness = true;
                malariaScore++;
            }
        }

        if (malariaScore > 6) {
            System.out.println("\n\nOops! " + userName + " you are having malaria.");
            System.out.println("I understand this must be concerning news.\nMalaria can be serious, but it's also treatable");
            System.out.println("We recommend you seek immediate medical attention.");
            System.out.println("A doctor can confirm the diagnosis and prescribe the right medication.");
        }
    }

    public static void obesityTest() {
        obesityScore = 0;
        if (fatigue) {
            obesityScore++;
        }
        if (jointPain) {
            obesityScore++;
        }
        if (highBP) {
            obesityScore++;
        }
        if (obesityScore == 3) {
            System.out.println("You have obesity.");
            isFound = true;
        }
    }
    public static void cancerTest() {
        cancerScore = 0;
        if (fatigue) {
            cancerScore++;
        }
        if (fever) {
            cancerScore++;
        }
        if (pain) {
            cancerScore++;
        }
        if (difficultySwallowing) {
            cancerScore++;
        }
        if (jointPain) {
            cancerScore++;
        }
        if (bloating) {
            cancerScore++;
        }
        if (cough) {
            cancerScore++;
        }
        if (sweating) {
            cancerScore++;
        }
        if (weightLoss) {
            cancerScore++;
        }
        if (cancerScore >= 7) {
            System.out.println("You have cancer!");
            isFound = true;
        }
    }

    public static void notFound() {
        System.out.println("Oops! We can't find out what's wrong!");
        System.out.println("We advise that you seek a medical professional advice as soon as possible.");
    }

    public static void question() {
        Scanner scanAnswer = new Scanner(System.in);
        answer = scanAnswer.nextLine();
        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("y")) {
            answer = "1";
        }
    }
}