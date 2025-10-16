package Praktikum06.Karyawan;
 
public class Karyawan {
     /**
     * @param args the command line arguments
     */
    // public static void main(String[] args) {
    //     // TODO code application logic here
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                gaji = 3000000;
                break;
            case '3':
                gaji = 2000000;
                break;
            case '4':
                gaji = 1000000;
                break;
            case '5':
                gaji = 750000;
                break;
        }
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public String getGolongan() {
        return golongan;
    }

    public double getGaji() {
        return gaji;
    }

    
        
}
