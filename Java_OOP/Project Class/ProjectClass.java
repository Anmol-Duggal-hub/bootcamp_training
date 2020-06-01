
class ProjectClass {
    private String name;
    private String description;
    private Double initialCost;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Double getinitialCost(){
        return initialCost;
    }

    public void setinitialCost(Double initialCost){
        this.initialCost = initialCost;
    }


    public ProjectClass(){
    }

    public ProjectClass(String name){
        this.name = name;
    }

    public ProjectClass(String name, String description, Double initialCost){
        this.name =  name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String elevatorPitch(){
        System.out.println(this.name + " ($" + initialCost + ") " + " : " + this.description);
        return this.name + " ($" + initialCost + ") " + " : " + this.description;
    }



}