package Praktikum05.InheritancePegawai;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        // this.nip = nip;
        // this.nama = nama;
        // this.gaji = gaji;
        // super.nip = nip;
        // super.nama = nama;
        // super.gaji = gaji;
        this.nidn = nidn;
        System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    }

    public String getInfo() {
        return "NIDN   : " + nidn + "\n";
    }

    public String getAllInfo() {
        // String info = "";
        // info += "NIP    : " + super.nip + "\n";
        // info += "Nama   : " + super.nama + "\n";
        // info += "Gaji   : " + super.gaji + "\n";
        // info += "NIDN   : " + this.nidn + "\n";
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
    
}
