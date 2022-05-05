package d01_Records;

import java.util.Objects;

public class EmployeeClass {

    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeeNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeClass)) return false;

        EmployeeClass that = (EmployeeClass) o;

        if (employeeNumber != that.employeeNumber) return false;
        return name.equals(that.name);
    }
}
