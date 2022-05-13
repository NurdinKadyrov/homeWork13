package com.company;

import java.util.Arrays;

public class Class {
    private int num;
    private  String name;
    private int[] array;

    public Class(int num, String name, int[] array) {
        this.num = num;
        this.name = name;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class _" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", array=" + Arrays.toString(array);
    }
}
