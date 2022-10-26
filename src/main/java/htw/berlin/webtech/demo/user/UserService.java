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
        return users.stream().map(this::transformEntity).collect(Collectors.toList());

    }


    public User create(UserCreateOrUpdateRequest request){

        var UserEntity = new UserEntity(request.getFirstName(), request.getLastName(), request.getWeight(),
                request.getHeight(), request.getAge(), request.getBmi(), request.getGoalW());
        UserEntity = userRepository.save(UserEntity);

        return transformEntity(UserEntity);


    }

    public User findById(Long id){
        var userEntity = userRepository.findById(id);
        return userEntity.isPresent()? transformEntity(userEntity.get()) : null;
    }

    public User update(Long id, UserCreateOrUpdateRequest request){

        var userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isEmpty()){
            return null;
        }

        var userEntity = userEntityOptional.get();
        userEntity.setFirstName(request.getFirstName());
        userEntity.setLastName(request.getLastName());
        userEntity.setWeight(request.getWeight());
        userEntity.setHeight(request.getHeight());
        userEntity.setAge(request.getAge());
        userEntity.setBmi(request.getBmi());
        userEntity.setGoalW(request.getGoalW());
        userEntity = userRepository.save(userEntity);

        return transformEntity(userEntity);


    }

    private User transformEntity(UserEntity userEntity){
        return new User(userEntity.getId(),
                userEntity.getFirstName(), userEntity.getLastName(), userEntity.getWeight(), userEntity.getHeight(),
                userEntity.getAge(), userEntity.getBmi(), userEntity.getGoalW());
    }

    public boolean deleteById(Long id) {
        if(!userRepository.existsById(id)){
            return false;
        }

        userRepository.deleteById(id);
        return true;
    }
}
