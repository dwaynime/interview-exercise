package com.openlending.credit;

public class ExperianService implements CreditScoreService {

  @Override
  public CreditBureau getCreditBureauName() {
    return CreditBureau.EXPERIAN;
  }

  @Override
  public int getCreditScore() {
    return 700;
  }
}
