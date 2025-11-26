package demo;

import java.time.Year;

public abstract class WorkTool {
    String name;
    int productionYear;

    public WorkTool(){}
    public WorkTool(String name, int productionYear){
        this.name=name;
        this.productionYear=Math.min(productionYear, Year.now().getValue());
    }
    public abstract void use();
}
