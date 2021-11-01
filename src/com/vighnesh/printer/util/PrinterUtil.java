package com.vighnesh.printer.util;

import com.vighnesh.datatype.DataType;

public class PrinterUtil {
    public synchronized void print(final DataType a) {
        long id = Thread.currentThread().getId();
        System.out.println("Thread id " + id + " Value is " + a.toString());
    }
}