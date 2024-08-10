package ConstructorDI;

public class UserService {
    private final String name;
    private final int age;
    private UserDAO userDAO;

    public UserService(String name, int age, UserDAO userDAO) {
        this.name = name;
        this.age = age;
        this.userDAO = userDAO;
    }
}
