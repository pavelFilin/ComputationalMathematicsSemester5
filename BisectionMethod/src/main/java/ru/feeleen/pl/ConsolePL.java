package ru.feeleen.pl;

import ru.feeleen.bll.BisectionMethod;

public class ConsolePL implements Runnable {

    BisectionMethod bm = new BisectionMethod();

    public void run() {
        System.out.println(bm.getX(0.000000000000001));
    }
}
