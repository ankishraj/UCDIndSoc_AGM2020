package program;

public class Voter {
    long studentNumber;
    String email;
    boolean passedVerification;

    Voter(String email, Long studentNumber) {
        this.studentNumber = studentNumber;
        this.email = email;
        passedVerification = false;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setPassedVerification(boolean passedVerification) {
        this.passedVerification = passedVerification;
    }

    public void print() {
        String result = passedVerification? "valid" : "INVALID!";
        System.out.print(studentNumber + " : " + email + " : " + result);
    }
}
