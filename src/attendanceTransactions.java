public class attendanceTransactions {

    double attendedClasses;
    double totalClasses;

    // Constructor
    attendanceTransactions(int attendedClasses, int totalClasses) {
        this.attendedClasses = attendedClasses;
        this.totalClasses = totalClasses;
    }


    public double getAfterAttendanceRate() {
        if (totalClasses == 0) return 0;
        return (attendedClasses / totalClasses) * 100;  
    }
}


