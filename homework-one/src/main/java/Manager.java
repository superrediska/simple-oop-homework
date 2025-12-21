import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
@Getter
public class Manager extends Employee {
    private int grade;


    double calculateSalary(){
        return getBaseSalary() * grade;

    }

    public void display() {
        System.out.println(grade);
    }

}