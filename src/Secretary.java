public class Secretary extends Employee{

    private String office;

    public Secretary() {
        super();
    }

    public Secretary(String office, Name name, Double salary) {
        super(name, salary);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "office='" + office + '\'' +
                "} " + super.toString();
    }
}
