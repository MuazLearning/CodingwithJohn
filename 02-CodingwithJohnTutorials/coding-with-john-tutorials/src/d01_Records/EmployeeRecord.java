package d01_Records;

public record EmployeeRecord(String name, int employeeNumber) { // Cant extend, final. Can implement.
    public static final String DEFAULT_EMPLOYEE_NAME = "John Doe";

//    private String something; // Cant be

    public EmployeeRecord(String name, int employeeNumber) {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("Employee number must be positive");
        }

        this.name = name;
        this.employeeNumber = employeeNumber;
    }


    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("Whatever");
    }

}
