package com.openlending.credit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditScoreServiceFactoryTest {

    @Test
    void transUnionReturnsExpectedScore() {
        CreditScoreService service =
                CreditScoreServiceFactory.getCreditScoreService(CreditBureau.TRANSUNION);

        assertEquals(800, service.getCreditScore());
        assertEquals(CreditBureau.TRANSUNION, service.getCreditBureauName());
    }
}
