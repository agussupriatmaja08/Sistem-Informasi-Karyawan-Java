package SistemInformasiKaryawan;



//Inheritances ke KaryawanSuper
public class Karyawan extends KaryawanSuper{
	
	//Constructors
	public Karyawan(String nama, int Nik, int gaji) {
		this.nama = nama;
		this.Nik = Nik;
		this.gaji = gaji;
		totalGaji = totalGaji + gaji;
		jmlhKaryawan++;
		
	}
	//Constructors
	public Karyawan() {
		
	}
	//Polymorphism 
	@Override public String toString(){
        return "\t[Nama : " + nama + " | Nik : " + Nik+ " | Gaji : " + gaji+ "]";
    }

}
