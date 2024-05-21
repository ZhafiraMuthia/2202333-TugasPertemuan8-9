package no2;

public class Student extends Person{
    
    public static final String TAHUNPERTAMA = "Tahun Pertama";
    public static final String TAHUNKEDUA   = "Tahun Kedua";
    public static final String JUNIOR       = "Junior";
    public static final String SENIOR       = "Senior";
    
    private String statusKelas;
    
    public Student(String nama, String alamat, String noTelp, String email, String statusKelas) {
        super(nama, alamat, noTelp, email);
        this.statusKelas = statusKelas;
    }
    
    public String getStatus() {
        return statusKelas;
    }
    public void setStatus(String statusKelas) {
        this.statusKelas = statusKelas;
    }
    
    @Override
    public String toString() {
        return "Student: " + getNama();
    }
}
