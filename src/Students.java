class Students {
    String firstName;
    String lastName;
    int studentId;
    int totalClasses;
    int attendedClasses;
    int registrationYear;

    // Constructor
    public Students(String firstName, String lastName, int studentId, int totalClasses, int attendedClasses, int registrationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
        this.registrationYear = registrationYear;
    }


    public double getAttendanceRate() {
        return (double) attendedClasses / totalClasses * 100;
    }


    public String getStudentInfo() {
        return firstName + " " + lastName + " (ID: " + studentId + ", Registered in: " + registrationYear + ")";
    }
}