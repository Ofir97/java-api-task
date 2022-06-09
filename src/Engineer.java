public class Engineer extends Employee{

    private String speciality;

    public Engineer() {}

    public Engineer(String speciality, Name name, Double salary) {
        super(name, salary);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "speciality='" + speciality + '\'' +
                "} " + super.toString();
    }
}
