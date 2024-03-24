package springboot.onlinebookstore.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Objects;
import org.springframework.beans.BeanWrapperImpl;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
    private String password;
    private String repeatPassword;

    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        this.password = constraintAnnotation.password();
        this.repeatPassword = constraintAnnotation.repeatPassword();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Object passwordValue = new BeanWrapperImpl(o)
                .getPropertyValue(password);
        Object repeatPasswordValue = new BeanWrapperImpl(o)
                .getPropertyValue(repeatPassword);
        if (passwordValue != null) {
            return Objects.equals(passwordValue, repeatPasswordValue);
        } else {
            return Objects.equals(password, repeatPassword);
        }
    }
}
