package Model;

import java.util.List;

/**
 * Created by kristof on 29/08/2016.
 */
public class User {
    Long id;
    String firstName;
    String lastName;
    String email;
    List<Roles> roles;
    Group group;
}
