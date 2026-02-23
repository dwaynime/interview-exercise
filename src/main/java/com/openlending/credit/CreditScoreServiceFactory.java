package com.openlending.credit;

/**
 * Factory to generate an implementation of CreditScoreService
 */
public class CreditScoreServiceFactory {

    public static CreditScoreService getCreditScoreService(CreditBureau bureau) {

        switch (bureau) {
            case EQUIFAX:
                return new EquifaxService();
            case EXPERIAN:
                return new ExperianService();
            case TRANSUNION:
                return new TransUnionService();
            default:
                throw new IllegalArgumentException("Unknown Credit Bureau: " + bureau);
        }
    }
}
