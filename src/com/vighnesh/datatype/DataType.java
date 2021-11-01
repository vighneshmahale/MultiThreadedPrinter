package com.vighnesh.datatype;

public abstract class DataType {
    public abstract String toString();
    public abstract Boolean equals(final DataType dataType);
    public abstract void increment();
}