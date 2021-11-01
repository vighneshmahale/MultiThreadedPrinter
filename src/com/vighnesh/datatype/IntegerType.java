package com.vighnesh.datatype;

public class IntegerType extends DataType {

    private int current;

    public IntegerType(final int start) {
        current = start;
    }

    public synchronized void increment() {
        current++;
    }

    public Integer getValue() {
        return current;
    }

    @Override
    public String toString() {
        return Integer.toString(current);
    }

    @Override
    public Boolean equals(final DataType dataType) {
        DataType external = (IntegerType) dataType;
        if(current == ((IntegerType) dataType).getValue()) return true;
        return false;
    }

}
