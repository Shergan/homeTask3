package com.divashchenko;

public class LongArithmetic {

    public String add(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        return doubleToString(Double.parseDouble(str1) + Double.parseDouble(str2));
    }

    public String del(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        return doubleToString(Double.parseDouble(str1) - Double.parseDouble(str2));
    }

    public String division(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        try {
            if (Double.parseDouble(str2) == 0) {
                throw new Exception("Division is impossible!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return doubleToString(Double.parseDouble(str1) / Double.parseDouble(str2));
    }

    public String multiply(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        return doubleToString(Double.parseDouble(str1) * Double.parseDouble(str2));
    }

    public String euclideanDivision(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        return doubleToString(Double.parseDouble(str1) % Double.parseDouble(str2));
    }

    public String squareRoot(String str) {
        if (!checkStringForNumbers(str)) {
            return "Error!";
        }
        return doubleToString(Math.sqrt(Double.parseDouble(str)));
    }

    public String exponentiation(String str1, String str2) {
        if (!checkStringForNumbers(str1, str2)) {
            return "Error!";
        }
        if (Double.parseDouble(str2) == 0) {
            return "1";
        } else if (Double.parseDouble(str2) > 0) {
            Double sum = Double.parseDouble(str1);
            for (int i = 1; i < Double.parseDouble(str2); i++) {
                sum *= Double.parseDouble(str1);
            }
            return doubleToString(sum);
        } else {
            Double sum = Double.parseDouble(str1);
            for (int i = -1; i > Double.parseDouble(str2); i--) {
                sum *= Double.parseDouble(str1);
            }
            sum = 1 / sum;
            return doubleToString(sum);
        }
    }

    public String rounding(String str) {
        if (!checkStringForNumbers(str)) {
            return "Error!";
        }
        return Math.round(Double.parseDouble(str)) + "";
    }

    private boolean checkStringForNumbers(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private boolean checkStringForNumbers(String str1, String str2) {
        try {
            double dStr1 = Double.parseDouble(str1);
            double dStr2 = Double.parseDouble(str2);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private String doubleToString(double number) {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%f", number));

        for (int i = sb.length() - 1; i > 1; i--) {
            if (sb.charAt(i) == '0' && sb.charAt(i - 1) != ',') {
                sb.deleteCharAt(i);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
