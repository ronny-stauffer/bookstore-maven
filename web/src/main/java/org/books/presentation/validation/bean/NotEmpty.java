package org.books.presentation.validation.bean;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=EmptyValidator.class)
@ReportAsSingleViolation
public @interface NotEmpty {

    public String message() default "{org.books.Bookstore.EMPTY_STRING}";

    public Class<?>[] groups() default {};
    
    public Class<? extends Payload>[] payload() default {};
    
}
