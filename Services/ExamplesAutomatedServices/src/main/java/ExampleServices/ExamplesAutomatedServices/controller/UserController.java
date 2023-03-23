package ExampleServices.ExamplesAutomatedServices.controller;

import ExampleServices.ExamplesAutomatedServices.model.User;
import ExampleServices.ExamplesAutomatedServices.response.ResponseExample;
import ExampleServices.ExamplesAutomatedServices.response.UserResponse;
import ExampleServices.ExamplesAutomatedServices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    private final UserService _userService;

    @Autowired
    public UserController(UserService _userService) {
        this._userService = _userService;
    }

    @PostMapping("user")
    private ResponseEntity<ResponseExample> create(@RequestBody User oUser) {
        ResponseExample response = _userService.createUser(oUser);
        if(response.data == null){
            return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_ENTITY);
        }
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("user")
    private ResponseExample getAll() {
        return new ResponseEntity<>(_userService.listUsers(), HttpStatus.OK).getBody();
    }

    @GetMapping("user/{email}")
    private ResponseEntity<ResponseExample> findByEmail(@PathVariable(name = "email") String email) {
        ResponseExample response = _userService.findUserByEmail(email);
        if(response.data == null){
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("user/{email}")
    private ResponseEntity<ResponseExample> deleteByEmail(@PathVariable(name = "email") String email) {
        ResponseExample response = _userService.deleteUser(email);
        if(response.data == null){
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
