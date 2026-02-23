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

  }
}
