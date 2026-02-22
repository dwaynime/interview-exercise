package com.openlending.credit;

public class TransUnionService implements CreditScoreService {

    @Override
    public CreditBureau getCreditBureauName() {
        return CreditBureau.TRANSUNION;
    }

    @Override
    public int getCreditScore() {
        return 800;
    }
}
