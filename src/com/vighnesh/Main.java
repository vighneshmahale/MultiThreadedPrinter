package com.vighnesh;

import com.vighnesh.datatype.IntegerType;
import com.vighnesh.printer.runnable.BasePrinterRunnable;
import com.vighnesh.printer.util.PrinterUtil;

public class Main {

    public static void main(String[] args) {
        PrinterUtil printerUtil = new PrinterUtil();

        IntegerType start = new IntegerType(0);
        IntegerType end = new IntegerType(20);

        Thread thread1 = new Thread(new BasePrinterRunnable(printerUtil, start, end));
        Thread thread2 = new Thread(new BasePrinterRunnable(printerUtil, start, end));

        thread1.start();
        thread2.start();
    }
}
