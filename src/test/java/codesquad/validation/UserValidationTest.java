package codesquad.validation;

import codesquad.domain.User;
import codesquad.domain.UserDTO;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class UserValidationTest {
    private static Validator validator;
    private UserDTO userDTO;

    @BeforeClass
    public static void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Before
    public void setupUserDTO(){

    }

    @Test
    public void 이메일_포맷_통과() {
    }





}
