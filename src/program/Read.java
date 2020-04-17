package program;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

    public ArrayList<Member> readMembers(String filename) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(filename));
        ArrayList<Member> members = new ArrayList<Member>();

        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            assert nextLine != null;
            Member member = new Member(Long.parseLong(nextLine[0].trim()), nextLine[1].trim(), nextLine[2].trim());
            members.add(member);
        }
        return members;
    }

    public ArrayList<Voter> readVoters(String filename) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(filename));
        ArrayList<Voter> voters = new ArrayList<Voter>();

        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            assert nextLine != null;
            Voter voter = new Voter(nextLine[0].trim(), Long.parseLong(nextLine[1].trim()));
            voters.add(voter);
        }
        return voters;
    }
}
