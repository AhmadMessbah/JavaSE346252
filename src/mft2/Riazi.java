package mft2;

public class Riazi {
//    Method Overloading
//   - متد همنام به شرطی که تعداد یا نوع ورودی ها متفاوت باشند

    public int add(int aInt, int bInt) {
        System.out.println("Add Integers 3");
        return aInt + bInt;
    }

    public int add(int aInt, int bInt, int cInt) {
        System.out.println("Add Integers 3");
        return aInt + bInt + cInt;
    }


    public float add(float aFloat, float bFloat) {
        System.out.println("Add Floats");
        return aFloat + bFloat;
    }

    public String add(String aString, String bString) {
        System.out.println("Add Strings");
        return aString + bString;
    }
}
