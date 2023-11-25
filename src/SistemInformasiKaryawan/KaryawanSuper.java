package SistemInformasiKaryawan;

public class KaryawanSuper {
	public static int totalGaji;
	public static int jmlhKaryawan = 1;
	protected String nama;
	protected int Nik;
	protected int gaji;
	private String alamat;
	private String tempatKerja;
	

	
	//Instance method
	//getter
	public String getnama() {
		return nama;
	}
	public int getNik() {
		return Nik;
	}
	public int getGaji() {
		return gaji;
	}
	public String getAlamat() {
		return alamat;
	}
	public String getTempatKerja() {
		return tempatKerja;
	}
	
	//Instance method
	//setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setNik(int Nik) {
		this.Nik = Nik;
	}
	public void setGaji(int gaji) {
		this.gaji = gaji;
		totalGaji = gaji;		
	}
	public void setGaji2(int gaji) {
		this.gaji = gaji;
		
	}
	
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public void setTempatKerja(String tempatKerja) {
		this.tempatKerja = tempatKerja;
	}
	
	public void ubhGaji(int gaji) {
		this.gaji = gaji;
		totalGaji = totalGaji + gaji;
	}
	//Fuction
	public String toString(){
        return "\n\tNama karyawan :"+nama+"\n\t Nik : "+Nik+"\\n\\t Gaji : "+gaji+"\\n\\t Tempat kerja :"+ tempatKerja;
    }
	public void tampilGaji(){
        System.out.println("\t"+ nama +" \t\t| " + gaji );
    }
	
	
	//Statics methods
	public static void updateGaji(int a) {
		 totalGaji = totalGaji - a;
	}
	public static void HapusKaryawan() {
		jmlhKaryawan = jmlhKaryawan - 1;
	}
	public static int gajian(int a, int b) {
		int total = a - b;
		return total; 
	}
}
