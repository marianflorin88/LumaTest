package TestData;

public class User {
    private String email;
    private String password;
    private String expectedErrorMessage;
    private String expectedUrl;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String expectedUrl) {
        this.email = email;
        this.password = password;
        this.expectedUrl = expectedUrl;
    }

    public User(String email, String password, String expectedUrl, String expectedErrorMessage) {
        this.email = email;
        this.password = password;
        this.expectedUrl = expectedUrl;
        this.expectedErrorMessage = expectedErrorMessage;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getExpectedErrorMessage() {
        return expectedErrorMessage;
    }

    public String getExpectedUrl() {
        return expectedUrl;
    }
}
