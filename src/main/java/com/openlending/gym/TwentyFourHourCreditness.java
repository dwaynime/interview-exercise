package com.openlending.gym;
import com.openlending.credit.TransUnionService;
import com.openlending.credit.CreditScoreService;

public class TwentyFourHourCreditness {

  public static void main(String[] args) {
    System.out.println("####################################################################");
    System.out.println("# Welcome to 24 Hour Creditness! Apply for a membership today!     #");
    System.out.println("# All you need is a some java knowledge and a credit score.        #");
    System.out.println("####################################################################");

    CreditScoreService transUnionService = new TransUnionService();

    System.out.println("Bureau: " + transUnionService.getCreditBureauName());
    System.out.println("Score: " + transUnionService.getCreditScore());

    // TODO: create an implementation of CreditScoreService for Transunion

    // TODO: output the credit score of your implementation above

    // TODO - add functionality to CreditScoreServiceFactory to generate implementations of CreditScoreService

    // TODO - using the CreditScoreServiceFactory output the credit bureau name and credit score for all CreditBureaus

    // TODO - output the name of the credit bureau which returns the highest credit score
  }
}
