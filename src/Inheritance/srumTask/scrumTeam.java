package Inheritance.srumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {
    public scrumMaster sm;

    public ArrayList<tester> testers = new ArrayList<>();
    public ArrayList<developer> developer = new ArrayList<>();

    public scrumTeam(scrumMaster sm) {
        this.sm = sm;
    }
    public void addTester(tester tester){
        testers.add( tester);
    }
    public void addTesters (tester[] testers){
        this.testers.addAll(Arrays.asList(testers));

    }

    public void removeTester(int ID){
        testers.removeIf( p -> p.ID == ID );
    }

    public String toString() {
        return "scrumTeam{" +
                "sm=" + sm.name +
                ", number of testers=" + testers.size() +
                ", developer=" + developer + //add arraylist first
                '}';
    }
}
