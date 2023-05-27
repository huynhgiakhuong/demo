package huynhgiakhuong.demo.repository;

import huynhgiakhuong.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FORM User WHERE u.username = ?1")
    User findByUsername(String username);
}
