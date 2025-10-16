package UTS1.SistemUser;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // --- 1. Persiapan Data Profile ---
        List<String> customerDocs = Arrays.asList("KTP.pdf", "SIM.jpg");
        UserProfile customerProfile = new UserProfile(101, "pass123", "Budi Santoso", 30, "budi@email.com", customerDocs);
        
        UserProfile adminProfile = new UserProfile(999, "adminPass", "Dewi Administrator", 45, "admin@system.com", Arrays.asList());

        // --- 2. Membuat Objek Customer dan Admin ---
        Customer budi = new Customer(customerProfile);
        Admin dewi = new Admin(adminProfile);

        System.out.println("\n--- Operasi Login/Logout (Diwarisi dari User) ---");
        // Login Customer
        budi.logIn(101, "pass123");
        
        // Login Admin
        dewi.logIn(999, "adminPass");

        System.out.println("\n--- Operasi Profil (Melalui Komposisi UserProfile) ---");
        // Customer mengakses datanya
        System.out.println("Nama Customer: " + budi.getProfile().getName());
        budi.getProfile().editProfile("Budi S.", "budi.s@new.com", 31);
        budi.getProfile().showDocuments();

        System.out.println("\n--- Operasi Spesifik Customer ---");
        System.out.println("Status Verifikasi Awal: " + budi.getVerificationStatus());
        budi.applyVerification(customerDocs);
        
        System.out.println("\n--- Operasi Spesifik Admin ---");
        dewi.updateVehicleDetails("V-100", "SUV Merah");
        dewi.addVehicle("Motor Honda PCX, Plat B 1234 XY");
        dewi.retrieveComplain();
        
        // Admin memverifikasi Customer
        dewi.verifyUser(budi);
        System.out.println("Status Verifikasi Akhir: " + budi.getVerificationStatus());
        
        System.out.println("\n--- Operasi Logout ---");
        budi.logOut();
        dewi.logOut();
    }
}