package huynhgiakhuong.demo.services;

import huynhgiakhuong.demo.entity.User;
import huynhgiakhuong.demo.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IuserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }
}
