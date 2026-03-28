import java.util.ArrayList;

public class IssueManager {
    ArrayList<Issue> issues = new ArrayList<>();

    public void addIssue(String title, String location) {
        issues.add(new Issue(title, location));
    }

    public void viewIssues() {
        for (int i = 0; i < issues.size(); i++) {
            System.out.print("ID: " + i + " -> ");
            issues.get(i).display();
        }
    }

    public void resolveIssue(int id) {
        if (id >= 0 && id < issues.size()) {
            issues.get(id).resolved = true;
        }
    }
}
