package codesquad.domain;

import codesquad.exception.UnVerificationException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(max = 30)
    private String email;

    @NotNull
    @Size(max = 30)
    private String name;

    @NotNull
    @Size(max = 30)
    private String password;

    @NotNull
    @Size(max = 15)
    private String phoneNumber;

    public User(UserDTO userDTO) {

    }

    public boolean isCorrectPassword(PasswordEncoder passwordEncoder, LoginDTO loginDTO) {
        if(!passwordEncoder.matches(loginDTO.getPassword(), this.getPassword())){
            return false;
        }
        return true;
    }

    public void encodePassword(PasswordEncoder passwordEncoder) {
        this.password = passwordEncoder.encode(password);
    }


}
