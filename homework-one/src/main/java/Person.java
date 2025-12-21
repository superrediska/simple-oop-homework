import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@Getter
@SuperBuilder
public class Person {
    private String name;
    private int age;
    private boolean isMarried;
    public void display() {
        System.out.println(this.toString());
    }

}
