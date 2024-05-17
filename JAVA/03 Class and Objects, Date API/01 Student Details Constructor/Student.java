public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void displayStudentDetails() {
        System.out.println("Student id:" + this.getStudentId());
        System.out.println("Student name:" + this.getStudentName());
        System.out.println("Address:" + this.getStudentAddress());
        System.out.println("College name:" + this.getCollegeName());
    }
}