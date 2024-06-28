import java.util.Scanner;
public class Main {
    public static boolean isFound;
    public static boolean isFemale, isMale;
    public static boolean cough, vomiting, fatigue, headache, fever, chill, discomfort, nausea, pain, drowsiness;
    public static boolean dehydration, catarrh, jointPain, highBP, skinChanges, difficultySwallowing, bloating;
    public static boolean lostAppetite, bleeding, sweating, weightLoss, snoring, depression, difficultyExercising;
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
            if (symptoms.equals("snoring")) {
                snoring = true;
            }
            if (symptoms.equals("depression")) {
                depression = true;
            }
            if (symptoms.equals("difficulty exercising") || symptoms.equals("exercising difficulty")) {
                difficultyExercising = true;
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
        if (malariaScore >= 1) {
            System.out.println("..checking for malaria");
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

        if (malariaScore > 3) {
            message("Malaria");
        } else {
            message2("Malaria");
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
        if (snoring) {
            obesityScore++;
        }
        if (depression) {
            obesityScore++;
        }
        if (difficultyExercising) {
            obesityScore++;
        }
        if (obesityScore >= 1) {
            System.out.println("...checking for obesity");
            System.out.println("Please answer the following questions to confirm: \n\n");
            obesityConfirm();
            isFound = true;
        }
    }

    public static void obesityConfirm () {
        if (!fatigue) {
            System.out.print("Are you having fatigue (Yes/No): ");
            question();
            if (answer.equals("1")) {
                fatigue = true;
                obesityScore++;
            }
        }
        if (!jointPain) {
            System.out.print("Are you having joint pain (Yes/No): ");
            question();
            if (answer.equals("1")) {
                jointPain = true;
                obesityScore++;
            }
        }
        if (!highBP) {
            System.out.print("Are you having high blood pressure (Yes/No): ");
            question();
            if (answer.equals("1")) {
                highBP = true;
                obesityScore++;
            }
        }
        if (!snoring) {
            System.out.print("Do you snore (Yes/No): ");
            question();
            if (answer.equals("1")) {
                snoring = true;
                obesityScore++;
            }
        }
        if (!depression) {
            System.out.print("Do you feel depressed (Yes/No): ");
            question();
            if (answer.equals("1")) {
                depression = true;
                obesityScore++;
            }
        }
        if (!difficultyExercising) {
            System.out.print("Do you have difficulty when exercising (Yes/No): ");
            question();
            if (answer.equals("1")) {
                difficultyExercising = true;
                obesityScore++;
            }
        }

        if (obesityScore > 3) {
            message("Obesity");
        } else {
            message2("Obesity");
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
        if (cancerScore > 2) {
            System.out.println("...checking for cancer.");
            System.out.println("Please answer the following questions to confirm: \n\n");
            cancerConfirm();
            isFound = true;
        }
    }
    public static void cancerConfirm () {
        if (!fatigue) {
            System.out.print("Are you having fatigue (Yes/No): ");
            question();
            if (answer.equals("1")) {
                fatigue = true;
                cancerScore++;
            }
        }
        if (!fever) {
            System.out.print("Are you having fever (Yes/No): ");
            question();
            if (answer.equals("1")) {
                fever = true;
                cancerScore++;
            }
        }
        if (!pain) {
            System.out.print("Are you feeling pain (Yes/No): ");
            question();
            if (answer.equals("1")) {
                pain = true;
                cancerScore++;
            }
        }
        if (!difficultySwallowing) {
            System.out.print("Do you have difficulty when swallowing (Yes/No): ");
            question();
            if (answer.equals("1")) {
                difficultySwallowing = true;
                cancerScore++;
            }
        }
        if (!jointPain) {
            System.out.print("Do you have pain in your joints (Yes/No): ");
            question();
            if (answer.equals("1")) {
                jointPain = true;
                cancerScore++;
            }
        }
        if (!bloating) {
            System.out.print("Do you experience bloating (Yes/No): ");
            question();
            if (answer.equals("1")) {
                bloating = true;
                cancerScore++;
            }
        }
        if (!cough) {
            System.out.print("Do you experience cough at regular intervals (Yes/No): ");
            question();
            if (answer.equals("1")) {
                cough = true;
                cancerScore++;
            }
        }
        if (!sweating) {
            System.out.print("Do you sweat profusely (Yes/No): ");
            question();
            if (answer.equals("1")) {
                sweating = true;
                cancerScore++;
            }
        }
        if (!weightLoss) {
            System.out.print("Are you experiencing weight loss (Yes/No): ");
            question();
            if (answer.equals("1")) {
                weightLoss = true;
                cancerScore++;
            }
        }

        if (cancerScore > 4) {
            message("Cancer");
        } else {
            message2("Cancer");
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

    public static void message(String message) {
        System.out.println("\n\nOops! " + userName + " these are the symptoms of " + message);
        System.out.println("\nI understand this must be concerning news. \n" + message + " can be serious, but it's also treatable");
        System.out.println("We recommend you seek immediate medical attention.");
        System.out.println("A doctor can confirm the diagnosis and prescribe the right medication.\n\n");
    }

    public static void message2(String message) {
        System.out.println("\n\nCongrats! " + userName + " you are not having symptoms of " + message);

    }
}