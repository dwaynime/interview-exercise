package com.openlending.gym;
import com.openlending.credit.CreditBureau;
import com.openlending.credit.CreditScoreService;
import com.openlending.credit.CreditScoreServiceFactory;

public class TwentyFourHourCreditness {

  public static void main(String[] args) {
    System.out.println("####################################################################");
    System.out.println("# Welcome to 24 Hour Creditness! Apply for a membership today!     #");
    System.out.println("# All you need is a some java knowledge and a credit score.        #");
    System.out.println("####################################################################");

    int highestScore = Integer.MIN_VALUE;
    CreditBureau highestBureau = null;

    for (CreditBureau bureau : CreditBureau.values()) {

      CreditScoreService service = CreditScoreServiceFactory.getCreditScoreService(bureau);

      System.out.println("Bureau: " + service.getCreditBureauName());
      System.out.println("Score: " + service.getCreditScore());
      System.out.println("-----------------------------");

      if (service.getCreditScore() > highestScore) {
        highestScore = service.getCreditScore();
        highestBureau = service.getCreditBureauName();
      }
    }

    System.out.println("Highest score bureau: " + highestBureau + " with score " + highestScore);

    // TODO: create an implementation of CreditScoreService for Transunion

    // TODO: output the credit score of your implementation above

    // TODO - add functionality to CreditScoreServiceFactory to generate implementations of CreditScoreService

    // TODO - using the CreditScoreServiceFactory output the credit bureau name and credit score for all CreditBureaus

    // TODO - output the name of the credit bureau which returns the highest credit score
  }
}
