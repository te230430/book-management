package com.example.book_management;

// ★ 不足していたインポートをしっかり追加します
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// ★ public をつけて、独立したクラスにします
public class ValidPriceValidator implements ConstraintValidator<ValidPrice, Double> {
    private static final double MIN_PRICE = 100;
    private static final double MAX_PRICE = 1000000;

    @Override
    public void initialize(ValidPrice annotation) {
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value >= MIN_PRICE && value <= MAX_PRICE;
    }
}