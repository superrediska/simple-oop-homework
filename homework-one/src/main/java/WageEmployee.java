import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
@Getter
public class WageEmployee extends Employee {
    private double wage;
    private double hours;

    double  calculateSalary(){
        return getBaseSalary() + (hours * wage);
    }
    public void display() {
        System.out.println(this.toString());
    }
}