package UTS1.SistemUser;

public class Admin extends User {

    // Constructor
    public Admin(UserProfile profile) {
        super(profile); // Memanggil constructor User
        System.out.println("Akun Admin dibuat.");
    }

    // Metode (Operations)
    
    public void updateVehicleDetails(String vehicleId, String details) {
        System.out.println("Admin memperbarui detail kendaraan ID: " + vehicleId + " menjadi: " + details);
        // Logika nyata untuk memperbarui di database
    }

    // Asumsi: 'Vehicle' 
    public void addVehicle(String vehicleData) { 
        System.out.println("Admin menambahkan kendaraan baru dengan data: " + vehicleData);
    }

    public void retrieveComplain() {
        System.out.println("Admin mengambil daftar komplain yang belum diproses.");
    }

    public void verifyUser(Customer customer) {
        // Admin memverifikasi objek Customer yang dilewatkan
        if (customer.getVerificationStatus() == false) {
            customer.setVerificationStatus(true);
        } else {
            System.out.println("Customer " + customer.getProfile().getName() + " sudah terverifikasi.");
        }
    }
}