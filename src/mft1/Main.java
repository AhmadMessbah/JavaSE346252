package mft1;


public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setFirstName("John");


        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("ali");
        employee.setLastName("alipour");
        employee.setAddress("Tehran");
        System.out.println(employee);

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.setId(1);
        System.out.println(onlineStudent);
    }
}
