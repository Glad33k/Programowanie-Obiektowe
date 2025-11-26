package demo;

public class Saw extends WorkTool{

    public Saw(){}
    public Saw(String name, int productionYear){
        super(name,productionYear);
    }

    @Override
    public void use() {
        System.out.println("Użyto piły do przecięcia deski");
    }
}
