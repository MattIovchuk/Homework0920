public class Main {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Big Boss","Director", "greatestwarriorcentury@yahoo.com", "+1-968-495-50-59", 30000, 71);
        emplArray[1] = new Employee("Solid Snake","Sale Manager", "iroquoisf4knpliskin@gmail.com", "+1-696-969-69-69", 4000, 42);
        emplArray[2] = new Employee("Ocelot","Locksmith", "lalilulelo1@yahoo.com", "+7-909-842-64-24", 8695, 70);
        emplArray[3] = new Employee("Meryl","Secretary", "myuncleisdipshit@microsoft.com", "+1-905-485-04-43", 999, 29);
        emplArray[4] = new Employee("Raiden","Electrician", "nanomachinesson@gmail.com", "+1-945-321-53-24", 1337, 34);
        Employee.getData(emplArray[3]);
        System.out.println();
        for(int i = 0; i < emplArray.length; i++){
            if(Employee.getAge(emplArray[i]) > 40){
                Employee.getData(emplArray[i]);
            }
        }
    }
}