public class Director extends Employee{

    private String group;

    public Director() {}

    public Director(String group, Name name, Double salary) {
        super(name, salary);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Director{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }
}
