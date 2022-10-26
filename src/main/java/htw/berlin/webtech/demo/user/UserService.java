package htw.berlin.webtech.demo.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){

        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(userEntity -> new User(userEntity.getId(),
                userEntity.getFirstName(), userEntity.getLastName(), userEntity.getWeight(),
                userEntity.getAge(), userEntity.getBmi(), userEntity.getGoalW())).collect(Collectors.toList());

    }
}
