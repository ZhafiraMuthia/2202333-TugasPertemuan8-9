package no2;

import java.util.Scanner;

public class Tes {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        Person person = null;

        System.out.println("Pilih Jenis Data yang Ingin Diinput");
        System.out.println("1. Person");
        System.out.println("2. Student");
        System.out.println("3. Employee");
        System.out.println("4. Faculty");
        System.out.println("5. Staff");
        System.out.print("Masukkan Pilihan (1-5)    : ");
        int choice = userInput.nextInt();
        userInput.nextLine();

        System.out.print("Masukkan Nama             : ");
        String nama     = userInput.nextLine();
        System.out.print("Masukkan Alamat           : ");
        String alamat   = userInput.nextLine();
        System.out.print("Masukkan Nomor Telepon    : ");
        String noTelp   = userInput.nextLine();
        System.out.print("Masukkan Email            : ");
        String email    = userInput.nextLine();

        switch (choice) {
            case 1:
                person = new Person(nama, alamat, noTelp, email);
                break;
                
            case 2:
                System.out.println("Pilih Status Mahasiswa");
                System.out.println("1. Tahun Pertama");
                System.out.println("2. Tahun Kedua");
                System.out.println("3. Junior");
                System.out.println("4. Senior");
                System.out.print("Masukkan Pilihan (1-4) : ");
                int pilihStatus = userInput.nextInt();
                userInput.nextLine();
                
                String statusKelas = "";
                switch (pilihStatus) {
                    case 1: statusKelas = Student.TAHUNPERTAMA; break;
                    case 2: statusKelas = Student.TAHUNKEDUA; break;
                    case 3: statusKelas = Student.JUNIOR; break;
                    case 4: statusKelas = Student.SENIOR; break;
                }
                person = new Student(nama, alamat, noTelp, email, statusKelas);
                break;
                
            case 3:
                System.out.print("Masukkan Nama Kantor          : ");
                String namaKantor   = userInput.nextLine();
                System.out.print("Masukkan Gaji                 : ");
                double gaji         = userInput.nextDouble();
                System.out.print("Masukkan Tahun Dipekerjakan   : ");
                int tahun           = userInput.nextInt();
                System.out.print("Masukkan Bulan Dipekerjakan   : ");
                int bulan           = userInput.nextInt();
                System.out.print("Masukkan Hari Dipekerjakan    : ");
                int hari            = userInput.nextInt();
                MyDate tglDipekerjakan = new MyDate(tahun, bulan, hari);
                person = new Employee(nama, alamat, noTelp, email, namaKantor, gaji, tglDipekerjakan);
                break;
                
            case 4:
                System.out.print("Masukkan Nama Kantor          : ");
                namaKantor   = userInput.nextLine();
                System.out.print("Masukkan Gaji                 : ");
                gaji         = userInput.nextDouble();
                System.out.print("Masukkan Tahun Dipekerjakan   : ");
                tahun           = userInput.nextInt();
                System.out.print("Masukkan Bulan Dipekerjakan   : ");
                bulan           = userInput.nextInt();
                System.out.print("Masukkan Hari Dipekerjakan    : ");
                hari            = userInput.nextInt();
                tglDipekerjakan = new MyDate(tahun, bulan, hari);
                
                userInput.nextLine();
                System.out.print("Masukkan Jam Kerja            : ");
                String jamKerja = userInput.nextLine();
                System.out.print("Masukkan Pangkat              : ");
                String pangkat  = userInput.nextLine();
                person = new Faculty(nama, alamat, noTelp, email, namaKantor, gaji, tglDipekerjakan, jamKerja, pangkat);
                break;
                
            case 5:
                System.out.print("Masukkan Nama Kantor          : ");
                namaKantor   = userInput.nextLine();
                System.out.print("Masukkan Gaji                 : ");
                gaji         = userInput.nextDouble();
                System.out.print("Masukkan Tahun Dipekerjakan   : ");
                tahun           = userInput.nextInt();
                System.out.print("Masukkan Bulan Dipekerjakan   : ");
                bulan           = userInput.nextInt();
                System.out.print("Masukkan Hari Dipekerjakan    : ");
                hari            = userInput.nextInt();
                tglDipekerjakan = new MyDate(tahun, bulan, hari);
                
                userInput.nextLine();
                System.out.print("Masukkan Nama Pekerjaan       : ");
                String namaJob = userInput.nextLine();
                person = new Staff(nama, alamat, noTelp, email, namaKantor, gaji, tglDipekerjakan, namaJob);
                break;
                
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }
    
        System.out.println(person.toString());
    }
}
