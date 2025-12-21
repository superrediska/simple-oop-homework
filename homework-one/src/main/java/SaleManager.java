import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Getter
@SuperBuilder
public class SaleManager extends Employee {
    private double totalSales;
    private double bonus; // ?

    double calculateSalary() {
        return getBaseSalary() + bonus;
    }
    public void display() {
        System.out.println(this.toString());
    }


}