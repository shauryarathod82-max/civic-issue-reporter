public class Issue {
   String title;
String description;
String location;
    boolean resolved;

    public Issue(String title, String location) {
        this.title = title;
        this.location = location;
        this.resolved = false;
    }

    public void display() {
        System.out.println("Issue: " + title + " | Location: " + location + 
        " | Status: " + (resolved ? "Resolved" : "Pending"));
    }
}
