package htw.berlin.webtech.demo.user;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/v1/users")
    public ResponseEntity<List<User>> fetchUsers(){
        return ResponseEntity.ok(userService.findAll());

    }

    @PostMapping("/v1/users")
    public ResponseEntity<Void> createUser(@RequestBody UserCreateOrUpdateRequest request) throws URISyntaxException {

        var user = userService.create(request);
        URI uri = new URI("/user/v1/users/"+ user.getId());
        return ResponseEntity.created(uri).build();


    }

    @GetMapping("/v1/users/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable Long id){
        var user = userService.findById(id);
        return  user != null? ResponseEntity.ok(user): ResponseEntity.notFound().build();

    }

    @PutMapping("/v1/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UserCreateOrUpdateRequest request ){
        var user = userService.update(id, request);
       return  user != null? ResponseEntity.ok(user): ResponseEntity.notFound().build();
    }

    @DeleteMapping("/v1/users/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id){
        boolean successful = userService.deleteById(id);
        return successful? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }


}
