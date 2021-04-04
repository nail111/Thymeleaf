package Step9;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NailValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Nail {
    public String value() default "nail";
    public String message() default "must start with nail";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
