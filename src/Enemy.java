public class Enemy extends Character{
    private String grade;
    private String category;

    public Enemy(String isName, String isTitle, String isElement, String isAssociation, String isRegion,String isGrade, String isCategory){
        super(isName, isTitle, isElement, isAssociation, isRegion);
        this.grade = isGrade;
        this.category = isCategory;
    }

    public void Display(){
        super.Display();
        System.out.println("| Grade : " + this.grade);
        System.out.println("| Category   : " + this.category);
        System.out.println("=====================================");
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
