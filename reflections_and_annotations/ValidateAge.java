package reflections_and_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // вказує, що анотація має зберігатися і доступна в час виконання програми.
@Target(ElementType.FIELD) // вказує, що анотацію можна застосовувати до полів класу.
public @interface ValidateAge {
    int minAge() default 0;
}
