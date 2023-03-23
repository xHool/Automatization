package ExampleServices.ExamplesAutomatedServices.service;

import ExampleServices.ExamplesAutomatedServices.response.ResponseExample;
import ExampleServices.ExamplesAutomatedServices.response.UserResponse;
import ExampleServices.ExamplesAutomatedServices.model.User;
import ExampleServices.ExamplesAutomatedServices.repository.UserRepository;
import ExampleServices.ExamplesAutomatedServices.service.Implents.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final UserRepository _userRepository;

    @Autowired
    public UserService(UserRepository _userRepository) {
        this._userRepository = _userRepository;
    }

    @Override
    public ResponseExample createUser(User oUser) {
        ResponseExample response = new ResponseExample();
        try {
            response.data = UserResponse.mappingUserResponse(_userRepository.save(oUser));
            response.message = "User created successfully.";
        } catch (Exception e){
            response.data = null;
            response.message = "The email provided already exists.";
        }
        return response;
    }

    @Override
    public ResponseExample listUsers() {
        ResponseExample response = new ResponseExample();
        response.data =  UserResponse.mappingUsers(_userRepository.findAll());
        response.message = "users listed correctly";
        return response;
    }

    @Override
    public ResponseExample findUserByEmail(String email) {
        ResponseExample response = new ResponseExample();
        try {
            response.data =  UserResponse.mappingUserResponse(_userRepository.findByEmail(email));
            response.message = "User found successfully.";
        }catch (Exception e){
            response.message = e.getMessage();
        }
        return response;
    }

    @Override
    public ResponseExample deleteUser(String email) {
        ResponseExample response = new ResponseExample();
        try {
            User oUser = _userRepository.findByEmail(email);
            _userRepository.delete(oUser);
            response.message = "User deleted successfully";
        } catch (Exception e) {
            response.message = e.getMessage();
        }
        return response;
    }
}
