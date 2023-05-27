package huynhgiakhuong.demo.Validator;

import huynhgiakhuong.demo.Validator.anonation.ValidUsername;
import huynhgiakhuong.demo.repository.IuserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IuserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
