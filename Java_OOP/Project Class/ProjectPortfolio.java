import java.util.ArrayList;
public class ProjectPortfolio {
    private ArrayList<ProjectClass> projects = new ArrayList<ProjectClass>();

    public ArrayList<ProjectClass> getProjects(){
        return this.projects;
    }

    public void setProjects(ArrayList<ProjectClass> projects){
        this.projects = projects;
    }

    public ProjectPortfolio(){
    }

    public Double getPortfolioCost(ArrayList<ProjectClass> projects){
        Double sum = 0.0;
        for(int i=0;i<projects.size();i++){
            sum += projects.get(i).getinitialCost();
        }
        return sum;
    }

    public void showPortfolio(ArrayList<ProjectClass> projects){
        for(int i=0; i<projects.size(); i++){
            projects.get(i).elevatorPitch();
        }
        double portfolioTotal = getPortfolioCost(projects);
        System.out.println("The total cost of this Portfolio is " + portfolioTotal);
    }
}