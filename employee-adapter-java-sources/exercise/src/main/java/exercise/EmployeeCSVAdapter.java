package exercise;

public class EmployeeCSVAdapter implements Employee {
    private final EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
    }

    private String[] tokens() {
        return instance.tokens();
    }

    @Override
    public String getId() {
        return tokens()[0];
    }

    @Override
    public String getFirstName() {
        return tokens()[1];
    }

    @Override
    public String getLastName() {
        return tokens()[2];
    }

    @Override
    public String getEmail() {
        return tokens()[3];
    }
}
