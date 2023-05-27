package huynhgiakhuong.demo.Validator;

import huynhgiakhuong.demo.entity.Category;
import huynhgiakhuong.demo.Validator.anonation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category !=null && category.getId() !=null;
    }
}
