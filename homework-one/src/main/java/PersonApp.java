public class PersonApp {
    public static void print(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


    }

    public static void printSalary(Employee[] employees) {
        int cn = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                cn += (int) employee.calculateSalary();
            }
        }
        System.out.println(cn);
    }

    public static void printTotalSales(Employee[] employees) {
        int cn = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] instanceof SaleManager) {
                cn += (int) ((SaleManager) employees[i]).getTotalSales();
            }
        }
        System.out.println(cn);
    }

    public static boolean isName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                return true;
            }
        }
        return false;

    }
}