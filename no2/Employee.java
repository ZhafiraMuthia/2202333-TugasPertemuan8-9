package no2;

public class Employee extends Person{
    
    private String namaKantor;
    private double gaji;
    private MyDate tglDipekerjakan;
    
    public Employee(String nama, String alamat, String noTelp, String email,
                    String namaKantor, double gaji, MyDate tglDipekerjakan) {
        super(nama, alamat, noTelp, email);
        this.namaKantor      = namaKantor;
        this.gaji            = gaji;
        this.tglDipekerjakan = tglDipekerjakan;
    }
    
    public String getKantor() {
        return namaKantor;
    }
    public void setKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public MyDate tglDipekerjakan() {
        return tglDipekerjakan;
    }
    public void setTgl(MyDate tglDipekerjakan) {
        this.tglDipekerjakan = tglDipekerjakan;
    }
    
    @Override
    public String toString() {
        return "Employee: " + getNama();
    }
}
