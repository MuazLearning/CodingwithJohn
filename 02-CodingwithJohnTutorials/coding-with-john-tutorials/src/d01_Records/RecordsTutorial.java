package d01_Records;

public class RecordsTutorial {
    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Jerry", 12345);
        System.out.println(employee.getName());
        System.out.println(employee);

        EmployeeRecord employeeRecord = new EmployeeRecord("Kramer", 12332);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.printWhatever();
    }
}
