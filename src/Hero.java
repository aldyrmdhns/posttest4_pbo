public class Hero extends Character{
    private double attack;
    private int hp;
    private double deffense;
    private int elementalMastery;
    private double criticalRate;
    private double criticalDamage;

    public Hero(String isName, String isTitle, String isElement, String isAssociation, String isRegion,double isAttack, int isHp, double isDeff, int isElemental, double isCr, double isCd){
        super(isName, isTitle, isElement, isAssociation, isRegion);
        this.attack = isAttack;
        this.hp = isHp;
        this.deffense = isDeff;
        this.elementalMastery = isElemental;
        this.criticalRate = isCr;
        this.criticalDamage = isCd;
    }

    public void Display(){
        super.Display();
        System.out.println("=====================================");
    }

    public void Display(String names){
        if (super.name.equals(names)) {
            System.out.println("=====================================");
            System.out.println("| Name              : " + super.name);
            System.out.println("| Element           : " + super.element);
            System.out.println("| Attack            : " + this.attack);
            System.out.println("| HP                : " + this.hp);
            System.out.println("| Deffense          : " + this.deffense);
            System.out.println("| Elemental Mastery : " + this.elementalMastery);
            System.out.println("| Critical Rate     : " + this.criticalRate);
            System.out.println("| Critical Damage   : " + this.criticalDamage);
            System.out.println("=====================================");
        }
    }

    public void regionBuff(String names){
        super.regionBuff();
        if (super.name.equals(names)){
            if (super.region.equals("Mondstat")){
                System.out.println("Mondstat Character Got +20% Movement Speed");
            }
            else if (super.region.equals("Liyue")){
                System.out.println("Liyue Character Got -25% Stamina Reduction and +15% HP Increase");
            } else if (super.region.equals("Inazuma")){
                System.out.println("Inazuma Character Got +25% Increased chance while fishing");
            } else if (super.region.equals("Sumeru")){
                System.out.println("Sumeru Character Got +50% increased chance to double the potion");
            }
        }
    }

    public double getAttack() {
        return this.attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getDeffense() {
        return this.deffense;
    }

    public void setDeffense(double deffense) {
        this.deffense = deffense;
    }

    public int getElementalMastery() {
        return this.elementalMastery;
    }

    public void setElementalMastery(int elementalMastery) {
        this.elementalMastery = elementalMastery;
    }

    public double getCriticalRate() {
        return this.criticalRate;
    }

    public void setCriticalRate(double criticalRate) {
        this.criticalRate = criticalRate;
    }

    public double getCriticalDamage() {
        return this.criticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }
}
