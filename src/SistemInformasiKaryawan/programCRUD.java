
package SistemInformasiKaryawan;
import java.util.Scanner;
import java.util.LinkedList;

public class programCRUD {
	private static final Record Karyawan = null;
	// Membuat Instance/Objek dari LinkedList
	LinkedList<Karyawan> data;

	public programCRUD() {
		data = new LinkedList<>();
	}

	// Prosedur untuk menambahkan data karyawan
	public void tambah(Karyawan krw1) {

		if (!find(krw1.getNik())) {
			data.add(krw1);
		}
	}

	public boolean find(int b) {

		for (Karyawan a : data) {
			if (a.getNik() == b) {
				System.out.println("\t====================");
				System.out.println("\tGagagl!");
				System.out.println("\tNik " + a.getNik() + " sudah ada di database!");
				System.out.println("\t====================");

				return true;
			}
		}
		return false;
	}
	// Prosedur untuk menampilkan gaji karyawan 
	public void tampilGaji() {
		for (Karyawan k : data) {
			k.tampilGaji();
		}
	}

	// Prosedur untuk menampilkan seluruh data karyawan
	public void tampilkan() {
		for (Karyawan kwr1 : data) {
			System.out.println(kwr1.toString());
		}
		if (data.isEmpty()) {

			System.out.println("\tData masih kosong\n");

		}
	}

	// Prosedur untuk mencari data karyawan sesuai nik
	public void cari(int nik) {
		int a = 0;
		for (Karyawan c : data) {
			if (c.getNik() == nik) {
				System.out.println("\tData yang ditemukan :");
				System.out.println(c.toString());
				a = 1;
			}
		}
		if (a == 0) {
			System.out.println("\tData dengan nik " + nik + " tidak ditemukan!");
		}
	}
	// Prosedur untuk menghapus data karyawan sesuai nik
	public void hapus(int nik) {
		Karyawan del = null;
		int a = 0;
		for (Karyawan b : data) {

			if (b.getNik() == nik) {
				Scanner input = new Scanner(System.in);
				System.out.println("\n\tYakin data karyawan dengan nik " + b.getNik() + " dihapus ?");
				System.out.print("\ty/n : ");
				String pilih = input.next();
				if (pilih.equalsIgnoreCase("y")) {
					b.updateGaji(b.getGaji());
					b.HapusKaryawan();
					del = b;
					a = 0;
				} else {
					System.out.println("\tData tidak dihapus!");
					a = 1;
				}

			}
		}
		if (del == null) {
			if (a == 0) {
				System.out.println("\tNik tidak ditemukan!");
			}
		} else {

			data.remove(del);
			System.out.println("\tBerhasil dihapus!");
		}
	}
	// Prosedur untuk ubah data karyawan sesuai nik
	public void ubah(int key, Scanner input) {

		if (find2(key)) {
			Karyawan ubah2 = cariData(key);
			System.out.print("\tNama baru karyawan : ");
			String nama = input.next();
			System.out.print("\tJumlah gaji karyawan : ");

			int gajii = input.nextInt();

			ubah2.ubhGaji(gajii);
			ubah2.setNama(nama);

			System.out.println("\tData berhasil diubah!");
		} else {
			System.out.println("\tNik tidak ditemukan!");
		}
	}
	public boolean find2(int b) {
		for (Karyawan a : data) {
			if (a.getNik() == b) {
				System.out.println(
						"\t[Nama : " + a.getnama() + "| Nik : " + a.getNik() + " | Gaji : " + a.getGaji() + "]");
				return true;
			}
		}
		return false;
	}

	public Karyawan cariData(int nik) {

		for (Karyawan a : data) {
			if (a.getNik() == nik) {
				a.updateGaji(a.getGaji());
				return a;
			}
		}
		return null;
	}
	// Prosedur untuk bayar gaji karyawan sesuai nik
	public void bayarGaji(int a, int g) {
		int i = 0;
		for (Karyawan c : data) {
			if (c.getNik() == a) {
				System.out.println("\t===========================");
				System.out.println("\tGaji karyawan dalam kontrak \t: "+c.getGaji());
				c.setGaji2(c.gajian(c.getGaji(), g));
				c.updateGaji(g);
				System.out.println("\tJmlh gaji yg telah dibayar \t: " + g);
				if(c.getGaji()==0) {
					System.out.println("\tGaji sudah lunas!");	
				}else {
					System.out.println("\tSisa gaji belum yg dibayar \t: " + c.getGaji());
				}
				System.out.println("\t===========================");
				
				i = 1;
			}
		}if(i == 0) {
			System.out.println("\tNik "+a+" tidak ditemukan!");
		}
	}

}
