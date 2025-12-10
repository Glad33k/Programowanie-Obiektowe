package zad6;

public class userAuthentication implements Authentication{

    @Override
    public boolean login(String username, String password) {
        return username.equals("user");
    }

    @Override
    public void logout() {
        System.out.println("Wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return oldPassword.equals(newPassword);
    }

}
