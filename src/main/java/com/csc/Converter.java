package com.csc;

public class Converter {

    // Overloaded method: Default to 0 ounces if no argument is passed
    public String toPounds() {
        return toPounds(0);  // Default to 0 ounces
    }

    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        String unit = (pounds == 1.0) ? "lb" : "lbs";
        return String.format("%.4f %s", pounds, unit);
    }

    // Overloaded method: Default to 0 ounces if no argument is passed
    public String toPoundsAndOunces() {
        return toPoundsAndOunces(0);  // Default to 0 ounces
    }

    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;
        int remainingOunces = ounces % 16;
        String poundUnit = (pounds == 1) ? "lb" : "lbs";
        return pounds + " " + poundUnit + " " + remainingOunces + " oz";
    }

    // Convert from pounds and ounces to total ounces
    public String toOunces(int pounds, int ounces) {
        int totalOunces = (pounds * 16) + ounces;
        return totalOunces + " ounces.";
    }
}