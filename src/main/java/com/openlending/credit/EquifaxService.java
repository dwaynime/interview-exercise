package com.openlending.credit;

public class EquifaxService implements CreditScoreService {

  @Override
  public CreditBureau getCreditBureauName() {
    return CreditBureau.EQUIFAX;
  }

  @Override
  public int getCreditScore() {
    return 600;
  }
}
