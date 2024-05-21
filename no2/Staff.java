package no2;

public class Staff extends Employee{
    
    private String namaJob;
    
    public Staff(String nama, String alamat, String noTelp, String email, String namaKantor,
                 double gaji, MyDate tglDipekerjakan, String namaJob) {
        super(nama, alamat, noTelp, email, namaKantor, gaji, tglDipekerjakan);
        this.namaJob = namaJob;
    }
    
    public String namaJob() {
        return namaJob;
    }
    public void setStatus(String namaJob) {
        this.namaJob = namaJob;
    }
    
    @Override
    public String toString() {
        return "Staff: " + getNama();
    }
}
