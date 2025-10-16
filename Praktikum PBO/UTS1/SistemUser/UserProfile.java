package UTS1.SistemUser;
import java.util.List;

public class UserProfile {
    // Atribut (Attributes)
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    // Asumsi: doc menyimpan jpg., png., pdf.
    private List<String> doc; 

    // Constructor
    public UserProfile(int userId, String password, String name, int age, String emailId, List<String> doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    // Metode (Operations)
    
    // Getters
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }
    
    // Metode Aksi
    public void editProfile(String newName, String newEmail, int newAge) {
        this.name = newName;
        this.emailId = newEmail;
        this.age = newAge;
        System.out.println("Profil berhasil diperbarui.");
    }

    public void showDocuments() {
        System.out.println("Daftar Dokumen (" + name + "): " + doc);
    }

}
    