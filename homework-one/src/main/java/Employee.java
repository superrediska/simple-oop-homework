import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@ToString(callSuper = true)
@Getter
@SuperBuilder
public class Employee extends Person {
    private String company;
    private String position;
    private double baseSalary;

    double calculateSalary(){
        return baseSalary;

    }
    public void display() {
        System.out.println(this.toString());
    }

}
