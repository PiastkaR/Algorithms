package com.algorithms;

public class HighestAverage {
    private static class Student {
        public String name;
        public Double avg;
        Student(String n, Double a) {
            this.name = n;
            this.avg = a;
        }
    }
    public static void main(String[] args) {
        String[][] s = {{"Jerry", "65"}, {"Bob", "92"}, {"Jerry", "33"}, {"Eric", "83"},};
        Student maxStudent = new Student("", (double) Integer.MIN_VALUE);
        for (String[] strings : s) {
            if (Double.parseDouble(strings[1]) > maxStudent.avg) {
                maxStudent.name = strings[0];
                maxStudent.avg = Double.parseDouble(strings[1]);
            }
        }
        System.out.println("name: " + maxStudent.name + ", avg: " + maxStudent.avg);
    }
}

