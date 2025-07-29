package mft2;

public class Main {
    static boolean methodA(){
        System.out.println("Method A");
        return false;
    }

    static boolean methodB(){
        System.out.println("Method B");
        return true;
    }

    public static void main(String[] args) {
        System.out.println(methodA() && methodB());
    }

}
