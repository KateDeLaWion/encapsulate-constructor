class Student{
    private int StudentId;
    private String FirstName;
    private String LastName;
    private String StudentEmail;
    private String StudentPhone;

    public Student(int StudentId, String FirstName, String LastName, String StudentEmail, String StudentPhone){
        this.StudentId = StudentId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.StudentEmail = StudentEmail;
        this.StudentPhone = StudentPhone;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

}





public class EncapConstruct {
    public static void main(String[] args) {

    }
}
