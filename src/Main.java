import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String args[]) {
         Students student1 = new Students("Ceren ", "Bulut", 1, 30, 28, 2017);  // 30 ders, 28'ine katılmış, Kayıt Yılı: 2017
        Students student2 = new Students("Mehmet", "Öztürk", 2, 30, 22, 2018);  // 30 ders, 22'sine katılmış, Kayıt Yılı: 2018
        Students student3 = new Students("Ayşe", "Demir", 3, 40, 26, 2016);    // 40 ders, 26'sına katılmış, Kayıt Yılı: 2016
        Students student4 = new Students("Zeynep", "Çelik", 4, 35, 20, 2021);  // 35 ders, 20'sine katılmış, Kayıt Yılı: 2021


        System.out.println("Students1 attendance rate and registration year:");
        System.out.println(student1.getStudentInfo() + " - Attendance Rate: " + student1.getAttendanceRate() + "%");
        System.out.println("Students2 attendance rate and registration year:");
        System.out.println(student2.getStudentInfo() + " - Attendance Rate: " + student2.getAttendanceRate() + "%");
        System.out.println("Students3 attendance rate and registration year:");
        System.out.println(student3.getStudentInfo() + " - Attendance Rate: " + student3.getAttendanceRate() + "%");
        System.out.println("Students4 attendance rate and registration year:");
        System.out.println(student4.getStudentInfo() + " - Attendance Rate: " + student4.getAttendanceRate() + "%");


        List<Students> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        System.out.println("\nStudents whose names start with 'C':");
        students.stream()
                .filter((s) -> s.firstName.startsWith("C"))
                .map((s) -> s.firstName.toUpperCase())
                .sorted()
                .forEach((s) -> System.out.println(s));
    }
}


