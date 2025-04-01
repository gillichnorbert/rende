import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static ArrayList<Employee> readFile() {
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    public static ArrayList<Employee> tryReadFile() throws FileNotFoundException {
        ArrayList<Employee> empList = new ArrayList<>();
        String fileName = "dolgozok_002_rendbetett.csv";
        File file = new File(fileName);

        try(Scanner sc = new Scanner(file, "utf8")) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] array = line.split(":");
                Employee emp = new Employee();
                emp.nev = array[0];
                emp.anyjaNeve = array[1];
                emp.telepules = array[2];
                emp.lakcim = array[3];
                emp.fizetes = Double.parseDouble(array[4]);
                if (array[5].length() == 9) {
                    String[] dateArray = array[5].split("-");
                    emp.szuletes = LocalDate.of(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
                    // System.out.println(dateArray[2]);
                } else {
                    emp.szuletes = LocalDate.parse(array[5]);
                }
                emp.jutalom = Double.parseDouble(array[6]);
                empList.add(emp);
                // System.out.println(emp.szuletes);
            }
        }
        return empList;
    }
}
