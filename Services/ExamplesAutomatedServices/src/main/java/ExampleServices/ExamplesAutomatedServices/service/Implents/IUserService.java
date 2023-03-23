package ExampleServices.ExamplesAutomatedServices.service.Implents;

import ExampleServices.ExamplesAutomatedServices.response.ResponseExample;
import ExampleServices.ExamplesAutomatedServices.response.UserResponse;
import ExampleServices.ExamplesAutomatedServices.model.User;

import java.util.List;

public interface IUserService {
    ResponseExample createUser(User oUser);

    ResponseExample listUsers();

    ResponseExample findUserByEmail(String email);

    ResponseExample deleteUser(String email);
}
