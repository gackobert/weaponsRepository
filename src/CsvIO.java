import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvIO {
    private final String fileName = "weapons.csv";
    private List<Weapon> weaponList = new ArrayList<>();
    private String header;

    public void readCSV(){
        try(Stream<String> stream = Files.lines(Paths.get(fileName))) {
            List<String> csvStrings = stream.collect(Collectors.toList());
            header = csvStrings.get(0);
            csvStrings.remove(0);
            weaponList = (csvStrings.stream().map(Weapon::desirealize).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public String getHeader() {
        return header;
    }
}
