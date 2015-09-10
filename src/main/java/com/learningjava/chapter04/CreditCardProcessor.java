package com.learningjava.chapter04;

/**
 * Created by vashishta on 9/10/15.
 */
public class CreditCardProcessor<Request, Response> {

    Request request;
    Response response;

    public Response process() {
        return response;
    }
}
