package Homework_16_01_2025.Task2;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentInfo {
    String name() default "Unknown";
    String surname() default "Unknown";
    int groupNumber() default 0;
    boolean isOnline() default false;


}
