package program;

public class Member {
    long studentNumber;
    String name;
    String email;

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    Member(Long studentNumber, String email, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.email = email;
    }

    public void print(){
        System.out.println(this.studentNumber + " : " + this.name + " : " + this.email);
    }
}
