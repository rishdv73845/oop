import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

    void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    int getStudentId() {
        return this.studentId;
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setMajor(String major) {
        this.major = major;
    }

    String getMajor() {
        return this.major;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    long getPhoneNumber() {
        return this.phoneNumber;
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCount = 3;
        Student[] students = new Student[3];

        for (int i = 0; i < studentCount; i++) {
            students[i] = new Student();

            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            String phone = sc.next();

            String[] phoneParts = phone.split("-");
            String phoneString = phoneParts[0] + phoneParts[1] + phoneParts[2];

            long phoneNumber = Long.parseLong(phoneString);

            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phoneNumber);
        }

        for (int i = 0; i < studentCount; i++) {
            String phone = "0" + Long.toString(students[i].getPhoneNumber());

            String formattedPhone = "";

            for (int j = 0; j < phone.length(); j++) {

                formattedPhone = formattedPhone + phone.charAt(j);

                if (j == phone.length() - 9 || j == phone.length() - 5) {
                    formattedPhone = formattedPhone + "-";
                }
            }
            System.out.println(
                            students[i].getStudentId() + " " +
                            students[i].getName() + " " +
                            students[i].getMajor() + " " +
                            formattedPhone);
        }
    }
}