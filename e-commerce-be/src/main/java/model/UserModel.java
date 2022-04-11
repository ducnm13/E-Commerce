package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Users")
public class UserModel extends AbstractModel{

    @Id
    private String id;
    private String role;
    private String username;
    private String password;
    private String fullName;
    private String gender;
    private String email;
    private String phone;
    private String card;
    private String address;
    private Date birthDay;
    private boolean isActive;

}
