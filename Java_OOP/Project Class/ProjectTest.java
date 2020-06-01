import java.util.ArrayList;
public class ProjectTest {
    public static void main(String[] args) {
        ProjectClass testProject1 = new ProjectClass("Project X", "This is Project X", 100.00);
        testProject1.elevatorPitch();
        ProjectClass testProject2 = new ProjectClass("Project X", "This is Project X", 200.00);
        ProjectClass testProject3 = new ProjectClass("Project X", "This is Project X", 300.00);
        ProjectClass testProject4 = new ProjectClass("Project X", "This is Project X", 400.00);
        ProjectPortfolio testPortfolio = new ProjectPortfolio();

        ArrayList testprojects = testPortfolio.getProjects();
        testprojects.add(testProject1);
        testprojects.add(testProject2);
        testprojects.add(testProject3);
        testprojects.add(testProject4);
        testPortfolio.showPortfolio(testprojects);
    }

}