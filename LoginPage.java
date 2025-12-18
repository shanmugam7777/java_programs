class Login {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password must be at least 8 characters");
        }
    }

    public String getUsername() {
        return username;
    }
}
class LoginPage {
    public static void main(String[] args) {
        Login l = new Login();
        l.setUsername("admin");
        l.setPassword("admin123"); 
    }
}
