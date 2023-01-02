public class Employee {
    private String full_name;
    private String job_title;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String _full_name, String _job_title, String _email, String _phone, int _salary, int _age){
        full_name = _full_name;
        job_title = _job_title;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    public static void getData(Employee employee){
        System.out.println(employee.full_name + " | " + employee.job_title + " | " + employee.email + " | " + employee.phone + " | " + employee.salary + " | " + employee.age);
    }

    public static int getAge(Employee employee) {
        return employee.age;
    }
}
