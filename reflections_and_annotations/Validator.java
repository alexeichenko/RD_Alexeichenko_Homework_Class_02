package reflections_and_annotations;

import java.lang.reflect.Field;
import java.util.Objects;

public class Validator {
    public static void validate(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        // Перевіряю, чи наявна анотація @ValidateAge на полях класу, і якщо так, то виконується валідація.
        for (Field field : fields) {
            if (field.isAnnotationPresent(ValidateAge.class)) {
                ValidateAge annotation = field.getAnnotation(ValidateAge.class);
                int minAge = annotation.minAge();
                field.setAccessible(true);
                int value = field.getInt(object);
                if (value < minAge) {
                    throw new IllegalArgumentException("Вам немає 18-ти років.");
                }
            }
        }
    }
}
