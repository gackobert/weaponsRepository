import java.util.List;


public class Weapon {

    private String name;
    private int damage;
    private int speed;
    private int strength;
    private int value;
    private CombatType combatType;
    private DamageType damageType;


    public Weapon(String name, int damage, int speed, int strength, int value, CombatType combatType, DamageType damageType) {
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
        this.combatType = combatType;
        this.damageType = damageType;
    }


    public static Weapon desirealize(String csvLine){
        String[] a = csvLine.split(";");
        Weapon w = new Weapon(a[0], Integer.valueOf(a[3]), Integer.valueOf(a[4]), Integer.valueOf(a[5]), Integer.valueOf(a[6]), CombatType.valueOf(a[1]), DamageType.valueOf(a[2]));
        return w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    @Override
    public String toString() {
        return "Weapon" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", speed=" + speed +
                ", strength=" + strength +
                ", value=" + value +
                ", combatType=" + combatType +
                ", damageType=" + damageType;
    }
}
