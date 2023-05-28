import java.util.Scanner;   
public class A_06_MedicalExpertSystem {   
 public static void main(String[] args) {   
 try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Welcome to the Medical Expert System!");   
     System.out.println("Please answer the following questions to receive a diagnosis and  treatment recommendation.");   
     // Ask questions to diagnose the patient   
     System.out.println("Do you have a fever? (yes or no)");    String hasFever = scanner.nextLine().toLowerCase();   
     System.out.println("Do you have a cough? (yes or no)");    String hasCough = scanner.nextLine().toLowerCase();   
     System.out.println("Do you have a sore throat? (yes or no)");    String hasSoreThroat = scanner.nextLine().toLowerCase();   
     System.out.println("Do you have a runny nose? (yes or no)");    String hasRunnyNose = scanner.nextLine().toLowerCase();   
     System.out.println("Do you have a headache? (yes or no)");    String hasHeadache = scanner.nextLine().toLowerCase();   
     System.out.println("Do you have body aches? (yes or no)");   
     String hasBodyAches = scanner.nextLine().toLowerCase();   
     // Make diagnosis and recommend treatment   
     if (hasFever.equals("yes") && hasCough.equals("yes") && hasSoreThroat.equals("yes") &&  hasRunnyNose.equals("yes")) {   
     System.out.println("You may have a common cold. We recommend rest, fluids, and over the-counter medication for symptom relief.");   
     } 	else 	if 	(hasFever.equals("yes") 	&& 	hasCough.equals("yes") 	&& hasSoreThroat.equals("yes") 	 	&& 	hasRunnyNose.equals("no") 	&& hasHeadache.equals("yes") && hasBodyAches.equals("yes"))  {   
     System.out.println("You may have the flu. We recommend rest, fluids, and over-the counter medication for symptom relief. If symptoms worsen or persist, please consult a doctor.");   } else if (hasFever.equals("yes") && hasCough.equals("no") && hasSoreThroat.equals("no")) {   System.out.println("You may have a fever due to an underlying infection. We recommend  consulting a doctor for diagnosis and treatment.");   
     } else {   
     System.out.println("We cannot diagnose your condition based on the symptoms provided.  Please consult a doctor for diagnosis and treatment.");   
     }
}   
 }   
}  
