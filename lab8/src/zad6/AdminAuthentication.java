package zad6;

public class AdminAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return username.equals("admin");
    }

    @Override
    public void logout() {
        System.out.println("Admin Wylogowano");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return !oldPassword.equals(newPassword);
    }

    public static void main(String[] args) {
        AdminAuthentication admin=new AdminAuthentication();
        userAuthentication user=new userAuthentication();
        System.out.println(admin.login("admin","haslo"));
        admin.logout();
        System.out.println(admin.resetPassword("admin","haslo","haslo1"));
        System.out.println(user.login("user","haslo"));
       user.logout();
        System.out.println(admin.resetPassword("user","haslo","haslo1"));
    }
}
