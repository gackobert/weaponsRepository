import java.util.Comparator;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Printable p = weapons -> {weapons.forEach(weapon -> System.out.println(weapon));};

        Comparator<Weapon> damageComparator = (o1, o2) -> o2.getDamage() - o1.getDamage();
        Comparator<Weapon> alphaComparator = (o1, o2) -> {
            if (o1.getCombatType().toString().compareTo(o2.getCombatType().toString()) == 0) {
                if (o1.getDamageType().toString().compareTo(o2.getDamageType().toString()) == 0) {
                    if (o1.getName().toString().compareTo(o2.getName().toString()) == 0) {
                        return o1.getName().toString().compareTo(o2.getName().toString());
                    }
                } else {
                    return o1.getDamageType().toString().compareTo(o2.getDamageType().toString());
                }
            }
            return o1.getCombatType().toString().compareTo(o2.getCombatType().toString());
        };

        CsvIO c = new CsvIO();
        c.readCSV();
        List<Weapon> wea = c.getWeaponList();
        wea.sort(alphaComparator);
        p.print(wea);
    }
}


