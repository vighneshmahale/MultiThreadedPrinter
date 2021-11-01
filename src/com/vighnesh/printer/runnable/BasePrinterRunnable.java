package com.vighnesh.printer.runnable;

import com.vighnesh.datatype.DataType;
import com.vighnesh.printer.util.PrinterUtil;

public class BasePrinterRunnable implements Runnable {

    private final PrinterUtil printer;
    private final DataType end;
    private final DataType current;

    public BasePrinterRunnable(final PrinterUtil printerUtil, final DataType current, final DataType end) {
        this.printer = printerUtil;
        this.current = current;
        this.end = end;
    }

    private void print(final DataType a) {
        printer.print(a);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (current) {
                if(current.equals(end)){
                    current.notifyAll();
                    return;
                }
                print(current);
                current.increment();

                current.notifyAll();
                try {
                    current.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
