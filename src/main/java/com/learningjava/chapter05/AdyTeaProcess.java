package com.learningjava.chapter05;



/**
 * Created by vashishta on 9/10/15.
 */
public class AdyTeaProcess extends TeaTemplate {

    @Override
    protected void addMilk() {
        super.addMilk();
    }

    @Override
    protected void addSugar() {
        super.addSugar();
    }


    public static void main(String[] args) {
        TeaTemplate teaProcess = new AdyTeaProcess();
        teaProcess.makeTea();
    }
}
