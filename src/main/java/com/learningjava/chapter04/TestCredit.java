package com.learningjava.chapter04;

/**
 * Created by vashishta on 9/10/15.
 */
public class TestCredit {

    public static void main(String [] args) {

        CreditCardProcessor<MastercardRequest,MastercardResponse> processor = new CreditCardProcessor<>();
        processor.process();
    }
}
