public interface IStudent {
    public String getFirstName();
    public void setFirstName(String firstName);

    public void setAttendance(int attendedClasses);
    public double getAttendanceRate();

    public void setRegistrationYear(int registrationYear);
    public int getRegistrationYear();

    public void setLastName(String lastName);
    public String getLastName();

    public void setTotalClasses(int totalClasses);
    public int getTotalClasses();
}
