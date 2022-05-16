package arcesium;

public class Company{
         
         String name;
         String basename;

    public Company(String name, String basename) {
        this.name = name;
        this.basename = basename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasename() {
        return basename;
    }

    public void setBasename(String basename) {
        this.basename = basename;
    }
}