package homework.books.enums;

public enum User {
    ADMIN("admin", "123456");
    private final String login;
    private final String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public  String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


}
