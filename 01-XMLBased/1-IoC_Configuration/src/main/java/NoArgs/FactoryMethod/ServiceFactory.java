package NoArgs.FactoryMethod;

import BasicObjects.TestObject;

public class ServiceFactory extends TestObject {
    public UserService createUserService() {
        return new UserService();
    }
    public LoginService createLoginService() {
        return new LoginService();
    }
}
