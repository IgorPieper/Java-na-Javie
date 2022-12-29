package com.ltp.gradesubmission;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator<Score, String> {

    List<String> scores = Arrays.asList(
            "S", "A", "B", "C", "D", "E", "F", "s", "a", "b", "c", "d", "e", "f"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        for (String string: scores) {
            if (value.equals(string)) return true;
        }
        return false;
    }
}
