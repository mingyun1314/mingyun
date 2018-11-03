package laojiu.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer status;
    private Date last_modif_time;
    private Integer type_id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", last_modif_time=" + last_modif_time +
                ", type_id=" + type_id +
                '}';
    }
}
