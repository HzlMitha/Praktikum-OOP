package UTS1.SistemUser;
import java.util.List;

public class Customer extends User {
    // Atribut spesifik Customer
    private boolean verificationStatus = false; // Nilai default FALSE

    // Constructor
    public Customer(UserProfile profile) {
        super(profile); // Memanggil constructor User
        System.out.println("Akun Customer dibuat.");
    }

    // Metode (Operations)
    
    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(List<String> docs) {
        // Asumsi: docs adalah daftar path file (jpg, png, pdf)
        System.out.println("Pengajuan verifikasi dikirim dengan dokumen: " + docs);
        System.out.println("Status verifikasi menunggu persetujuan Admin.");
        // Dalam sistem nyata, ini akan mengubah status, tetapi admin yang akan menyetujui.
    }
    
    // Metode internal untuk diakses Admin
    public void setVerificationStatus(boolean status) {
        this.verificationStatus = status;
        if (status) {
            System.out.println("Customer " + getProfile().getName() + " telah diverifikasi.");
        } else {
            System.out.println("Verifikasi Customer " + getProfile().getName() + " dibatalkan.");
        }
    }
}