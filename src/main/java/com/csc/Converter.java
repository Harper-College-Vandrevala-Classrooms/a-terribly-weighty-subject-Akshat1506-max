package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;
    String unit = (pounds == 1.0) ? "lb" : "lbs";
    return String.format("%.4f %s", pounds, unit);
  }

  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16;
    int remainingOunces = ounces % 16;
    String poundUnit = (pounds == 1) ? "lb" : "lbs";
    return pounds + " " + poundUnit + " " + remainingOunces + " oz";
  }
}