package laojiu.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserType {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
