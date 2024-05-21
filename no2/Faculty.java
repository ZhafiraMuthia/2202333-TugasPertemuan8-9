package no2;

public class Faculty extends Employee{
    
    private String jamKerja;
    private String pangkat;
    
    public Faculty(String nama, String alamat, String noTelp, String email, String namaKantor,
                   double gaji, MyDate tglDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, noTelp, email, namaKantor, gaji, tglDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat  = pangkat;
    }
    
    public String jamKerja() {
        return jamKerja;
    }
    public void setJam(String jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public String pangkat() {
        return pangkat;
    }
    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
    
    @Override
    public String toString() {
        return "Faculty: " + getNama();
    }
}
