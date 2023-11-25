package MainSistemInformasiKaryawan;

import java.util.LinkedList;
import java.util.Scanner;
//melakukan import ke package SistemInformasiKaryawan
import SistemInformasiKaryawan.Karyawan;
import SistemInformasiKaryawan.programCRUD;

public class Main {

	public static void menu() {
		System.out.println("\t=================================");
		System.out.println("\t|No|\tMenu Karyawan\t\t|");
		System.out.println("\t=================================");
		System.out.println("\t|1 | Tambah karyawan\t\t| ");
		System.out.println("\t|2 | Tampilkan karyawan\t\t|");
		System.out.println("\t|3 | Cari data karyawan\t\t|");
		System.out.println("\t|4 | Ubah data karyawan\t\t|");
		System.out.println("\t|5 | Hapus data karyawan\t|");
		System.out.println("\t|6 | Total gaji semua karyawan\t|");
		System.out.println("\t|7 | Bayar gaji karyawan\t|");
		System.out.println("\t=================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programCRUD a = new programCRUD();
		Karyawan krw1 = new Karyawan();
		krw1.setNama("Agus");
		krw1.setNik(2115091047);
		krw1.setGaji(2000000);

		a.tambah(krw1);

		Scanner in = new Scanner(System.in);

		String lanjut;
		do {

			menu();
			try {
				System.out.println("\t=================================");
				System.out.print("\tPilih no :");
				int pilih = in.nextInt();
				System.out.println("\t=================================");

				switch (pilih) {
				case 1:
					System.out.println("\n\n\t=================================");
					System.out.println("\tTambahkan data karyawan");
					System.out.println("\t=================================");
					System.out.print("\tMasukan nama :");
					String nama = in.next();
					System.out.print("\tMasukan nik :");
					int nik = in.nextInt();
					System.out.print("\tMasukan gaji :");
					int gaji = in.nextInt();
					System.out.println("\t=================================");
					krw1 = new Karyawan(nama, nik, gaji);
					a.tambah(krw1);
					System.out.println("\tSeleai!");
					break;
				case 2:
					a.tampilkan();
					System.out.println("\n\tTotal jumlah karyawan : " + Karyawan.jmlhKaryawan);
					break;
				case 3 :
					System.out.print("\tMasukan nik yang dicari :");
					int b = in.nextInt();
					System.out.println();	
					
					a.cari(b);
					
					break;
				case 4:
					System.out.print("\tInput nik karyawan yang akan di update :  ");
					int nik2 = in.nextInt();
					a.ubah(nik2, in);

					break;
				case 5:

					System.out.print("\tInput nik karyawan yang akan di hapus : ");
					int nik3 = in.nextInt();
					a.hapus(nik3);
					break;
				case 6:
					System.out.println("\tRincian gaji karyawan");
					System.out.println("\t===========================");
					System.out.println("\tNama \t\t|Gaji");
					System.out.println("\t===========================");
					a.tampilGaji();
					System.out.println("\t===========================");
					System.out.println("\n\tTotal gaji \t" + Karyawan.totalGaji);
					break;
				case 7 :
					System.out.print("\tInput nik karyawan yang akan gajian : ");
					int nik4 = in.nextInt();
					System.out.print("\tInputkan gaji yang akan dibayar : ");
					int gajian = in.nextInt();
					a.bayarGaji(nik4, gajian);
					
					break;
			
				default :
					System.out.println("\tNomor yang diinputkan tidak tersedia!");
					break;
				}
			} catch (Exception e) {
				System.out.println("\tTerjadi error pada " + e);
				lanjut = in.next();
			}

			System.out.print("\n\tLanjut y/n : ");
			lanjut = in.next();
			System.out.print("\n");	
		} while (lanjut.equalsIgnoreCase("y"));

		System.out.println("\n\tTerima kasih ");
	}
	
	

}
