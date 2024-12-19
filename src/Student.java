class Student implements IStudent {

    String firstName;
    String lastName;

    int studentId;
    int totalClasses;
    int attendedClasses;
    int registrationYear;

    public int getStudentID() {
        return this.studentId;
    }

    public void setStudentID(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAttendance(int attendedClasses) {
        this.attendedClasses = attendedClasses;
    }

    public double getAttendanceRate() {
        attendanceTransactions attendanceObj = new attendanceTransactions(this.attendedClasses, this.totalClasses);
        return attendanceObj.getAfterAttendanceRate();
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

    public int getRegistrationYear() {
        return this.registrationYear;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }

    public int getTotalClasses() {
        return this.totalClasses;
    }
}
