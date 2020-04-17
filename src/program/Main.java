package program;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    final static Read read = new Read();

    public static void main(String args[]) throws IOException, com.opencsv.exceptions.CsvValidationException {
        //members CSV downloaded from SISWeb, with unnecessary columns removed
        ArrayList<Member> allMembers = read.readMembers("src/resources/members.csv");
        //downloaded from Google Forms, unnecessary columns removed
        ArrayList<Voter> allVoters = read.readVoters("src/resources/voters.csv");

        ArrayList<Voter> invalidVoters = new ArrayList<Voter>();
        int i = 1;
        String thisMembersEmail = "";
        //verification
        for (Voter voter : allVoters) {
            long voterStudentNumber = voter.getStudentNumber();
            for (Member member : allMembers) {
                long memberStudentNumber = member.getStudentNumber();
                if (voterStudentNumber == memberStudentNumber) {
                    thisMembersEmail = member.getEmail();
                    voter.setPassedVerification(true);
                    break;
                }
            }
            System.out.print(i++ + "  ");
            voter.print();
            if(voter.passedVerification)
                System.out.print(" !! " + thisMembersEmail);
            else
                invalidVoters.add(voter);
            System.out.println();
        }
        for(Voter voter : invalidVoters) {
            voter.print();
            System.out.println();
        }
    }
}
