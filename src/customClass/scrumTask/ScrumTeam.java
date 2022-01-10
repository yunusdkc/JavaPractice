package customClass.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<tester> testersList = new ArrayList<>();
    public ArrayList<developer> developersList = new ArrayList<>();
    public int daysOfString;

    public ScrumTeam(String PO, String BA, String SM, int daysOfString) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfString = daysOfString;
    }

    public void addTester(tester tester) {
        testersList.add(tester);
    }


    public void addTesters(tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }
}