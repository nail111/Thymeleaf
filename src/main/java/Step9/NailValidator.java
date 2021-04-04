package Step9;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NailValidator implements ConstraintValidator<Nail,String> {

    private String prefix;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;
        if(s !=null) {
            result = s.startsWith(prefix);
        } else {
            result = true;
        }

        return result;

    }

    @Override
    public void initialize(Nail constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }
}
