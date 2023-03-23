package ExampleServices.ExamplesAutomatedServices.response;

import ExampleServices.ExamplesAutomatedServices.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserResponse {
    public Long id;
    public String firtsname;
    public String lastname;
    public String email;

    public UserResponse(Long id, String firtsname, String lastname, String email) {
        this.id = id;
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.email = email;
    }

    public UserResponse() {
    }

    public static UserResponse mappingUserResponse(User oUser){
        return new UserResponse(
                oUser.getId(),
                oUser.getFirtsname(),
                oUser.getLastname(),
                oUser.getEmail()
        );
    }

    public static List<UserResponse> mappingUsers(List<User> oUser){
        ArrayList<UserResponse> oResponse = new ArrayList<>();
        oUser.forEach(user -> {
            oResponse.add(new UserResponse(user.getId(), user.getFirtsname(), user.getLastname(), user.getEmail()));
        });
        return oResponse;
    }
}
