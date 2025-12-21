public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = Manager.builder()
                .name("Олег")
                .age(21)
                .isMarried(true)
                .company("Google")
                .position("Employee")
                .baseSalary(3000)
                .grade(2)
                .build();
        employees[1] = WageEmployee.builder()
                .name("Александр")
                .age(30)
                .isMarried(false)
                .company("Yandex")
                .position("WageEmployee")
                .baseSalary(8000)
                .wage(1.2)
                .hours(800)
                .build();

        employees[2] = SaleManager.builder()
                .name("Ольга")
                .age(45)
                .isMarried(true)
                .company("Amazon")
                .position("SaleManager")
                .baseSalary(4500) // 1
                .totalSales(800)
                .bonus(200)
                .build();
        employees[3] = WageEmployee.builder()
                .name("Владимир")
                .age(35)
                .isMarried(true)
                .company("Oracle")
                .position("WageEmployee")
                .baseSalary(8000)
                .wage(1.5)
                .hours(600)
                .build();
        employees[4] = Manager.builder()
                .name("Максим")
                .age(26)
                .isMarried(false)
                .company("Microsoft")
                .position("Manager")
                .baseSalary(8000)
                .grade(3)
                .build();
        employees[5] = SaleManager.builder()
                .name("Светлана")
                .age(38)
                .isMarried(false)
                .company("Yandex")
                .position("SaleManager")
                .baseSalary(3000)
                .totalSales(600)
                .bonus(250)
                .build();
        employees[6] = WageEmployee.builder()
                .name("Дмитрий")
                .age(35)
                .isMarried(true)
                .company("BBC")
                .position("WageEmployee")
                .baseSalary(7000)
                .wage(1.3)
                .hours(550)
                .build();
        employees[7] = Manager.builder()
                .name("Андрей")
                .age(31)
                .isMarried(false)
                .company("Microsoft")
                .position("Manager")
                .baseSalary(8000)
                .grade(4)
                .build();
        employees[8] = Manager.builder()
                .name("Андрей")
                .age(31)
                .isMarried(false)
                .company("Yandex")
                .position("Manager")
                .baseSalary(6500)
                .grade(3)
                .build();
        employees[9] = SaleManager.builder()
                .name("Виктория")
                .age(19)
                .isMarried(false)
                .company("Google")
                .position("SaleManager")
                .baseSalary(3500)
                .totalSales(800)
                .bonus(255)
                .build();
        String name = "Александр";
//        PersonApp.print(employees);
//        PersonApp.printSalary(employees);
        PersonApp.printTotalSales(employees);
        PersonApp.isName(employees, name);
    }
}
