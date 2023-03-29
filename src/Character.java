public class Character {
    protected String name;
    protected String title;
    protected String element;
    protected String association;
    protected String region;

    public Character(String isName, String isTitle, String isElement, String isAssociation, String isRegion){
        this.name = isName;
        this.title = isTitle;
        this.element = isElement;
        this.association = isAssociation;
        this.region = isRegion;
    }

    public void Display(){
        System.out.println("=====================================");
        System.out.println("| Name          : " + this.name);
        System.out.println("| Title         : " + this.title);
        System.out.println("| Element       : " + this.element);
        System.out.println("| Association   : " + this.association);
        System.out.println("| Region        : " + this.region);
    }

    public void regionBuff(){
        System.out.println(" >> List Of Current Character Buff");
        System.out.println(" ----------------------------------");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getElement() {
        return this.element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getAssociation() {
        return this.association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
