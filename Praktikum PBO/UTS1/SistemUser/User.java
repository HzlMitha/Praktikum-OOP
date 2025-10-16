package UTS1.SistemUser;

public class User {
    // Komposisi: User memiliki UserProfile
    private UserProfile profile;

    // Constructor
    public User(UserProfile profile) {
        this.profile = profile;
    }

    // Metode (Operations)
    
    public boolean logIn(int userId, String password) {
        // Implementasi sederhana untuk login
        if (profile.getUserId() == userId && profile.getPassword().equals(password)) {
            System.out.println("Login berhasil untuk User ID: " + userId);
            return true;
        } else {
            System.out.println("Gagal login. User ID atau Password salah.");
            return false;
        }
    }

    public void recoverPassword() {
        System.out.println("Proses pemulihan kata sandi dimulai untuk " + profile.getEmailId());
        // Logika nyata akan mengirim email atau melakukan verifikasi lain.
    }

    public void logOut() {
        System.out.println("User ID " + profile.getUserId() + " telah logout.");
    }
    
    // Getter untuk mengakses profile (diperlukan oleh subclass/kelas lain)
    public UserProfile getProfile() {
        return profile;
    }
}