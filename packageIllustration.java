// File: com/solutions/software/packageIllustration.java
package com.solutions.software;

public class packageIllustration {
    private int    rollNo;
    private String name;

    public packageIllustration(int r, String n) { rollNo = r; name = n; }

    public void show() {
        System.out.println("Roll: " + rollNo + " | Name: " + name);
    }
}