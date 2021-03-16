/*
*	Nama	: Arfan psp
*	NIM		: 202013022
*	Prodi	: TIF 1B
*	Makul	: ALP
*
*/

import java.util.*;
public class projekuas{
	public static void main (String[]args){

// Tampilan Awal

		System.out.println();
		System.out.println("\t\t\t\t\t\t****************************************");
		System.out.println("\t\t\t\t\t\t=|                                    =|");
		System.out.println("\t\t\t\t\t\t=|          UAS Semester 1            =|");
		System.out.println("\t\t\t\t\t\t=|                                    =|");
		System.out.println("\t\t\t\t\t\t=|||||||||||||||||||||||||||||||||||||=|");
		System.out.println("\t\t\t\t\t\t=|                                    =|");
		System.out.println("\t\t\t\t\t\t=|        Program menghitung          =|");
		System.out.println("\t\t\t\t\t\t=|        Volume Bangun Ruang         =|");
		System.out.println("\t\t\t\t\t\t=|                                    =|");
		System.out.println("\t\t\t\t\t\t****************************************");
		System.out.println();
		login();

	}
// Masukkan Username dan Password

		static void login(){
		String data[]={"arfan","202013022"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		/**
		 * Percabangan untuk mengecek keberadaan data yang sudah kita inputkan di atas
		 */
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("=============================================");
			System.out.println("=                                           =");
			System.out.println("=            Selamat Datang Di              =");
			System.out.println("=         Program Menghitung Bangun         =");
			System.out.println("=                  Ruang                    =");
			System.out.println("=                                           =");
			System.out.println("=============================================");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println("Maaf Username atau Password yang Anda Masukkan Salah");
			System.out.println("Silahkan Masukkan Username dan Password Anda Kembali");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			login();
		}
		
		
	}

// Pemilihan di menu awal

	static void menu(){
		
		String menu_utama[]={"Mulai Program","Biodata Pemrogram","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
		System.out.println("3. "+menu_utama[2]);
		
		Scanner pilih=new Scanner(System.in);
		int menu;
		
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			mulai();
		}else if(menu==2){
			biodata();
		}else{
			System.out.println();
			System.out.println("Proses menghitung selesai");
			System.out.println("Sistem Sekarang Akan keluar");
			System.exit(0);
		}
	}

// Pemilihan bangun ruang yang ingin dihitung

	static void mulai(){

		int daftar_bangun;
		String bangun_ruang[]={"Volume Balok","Volume Prisma Segitiga","gabungan volume","Keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_ruang[0]);
		System.out.println("2. "+bangun_ruang[1]);
		System.out.println("3. "+bangun_ruang[2]);
		
		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1:

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok,lebar_balok,tinggi_balok,volume_balok;

					Scanner terimapanjang=new Scanner(System.in);
					panjang_balok=terimapanjang.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar=new Scanner(System.in);
					lebar_balok=terimalebar.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi=new Scanner(System.in);
					tinggi_balok=terimatinggi.nextDouble();

					volume_balok=panjang_balok*lebar_balok*tinggi_balok;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 2 :

					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segitiga    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma,tinggi_prisma,volume_prisma;

					Scanner terimaalasprisma=new Scanner(System.in);
					luas_alas_prisma=terimaalasprisma.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma=new Scanner(System.in);
					tinggi_prisma=terimatinggiprisma.nextDouble();

					volume_prisma=luas_alas_prisma*tinggi_prisma/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segitiga Adalah "+volume_prisma);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 3 :

				// Balok 

					System.out.println();
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok1,lebar_balok1,tinggi_balok1,volume_balok1;

					Scanner terimapanjang1=new Scanner(System.in);
					panjang_balok1=terimapanjang1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar1=new Scanner(System.in);
					lebar_balok1=terimalebar1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi1=new Scanner(System.in);
					tinggi_balok1=terimatinggi1.nextDouble();

					volume_balok1=panjang_balok1*lebar_balok1*tinggi_balok1;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Balok Telah Selesai");

				// Prisma Segitiga

					System.out.println();
					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segitiga    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma1,tinggi_prisma1,volume_prisma1;

					Scanner terimaalasprisma1=new Scanner(System.in);
					luas_alas_prisma1=terimaalasprisma1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma1=new Scanner(System.in);
					tinggi_prisma1=terimatinggiprisma1.nextDouble();

					volume_prisma1=luas_alas_prisma1*tinggi_prisma1/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segitiga Adalah "+volume_prisma1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Prisma Segitiga Telah Selesai");
					System.out.println();

					double volume[]={volume_balok1,volume_prisma1};//array
					double penampung=0;

	
					for(int h=0; h<(volume.length); h++){
						for(int i=0; i<(volume.length-1); i++){
						if(volume[i]>volume[i+1]){
						penampung=volume[i];
						volume[i]=volume[i+1];
						volume[i+1]=penampung;
					}
				 }
						System.out.print(h+1+" = ");
						for(int d=0; d<volume.length; d++){
						System.out.print(volume[d]+"  ");
					}
						System.out.println();
				}

					System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<volume.length; i++){
					System.out.print(volume[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();

					break;
		}

	}

// Biodata Pemrogram

	static void biodata(){

		System.out.println("Biodata Saya");
		System.out.println();
		System.out.println("Nama Saya : Arfan psp");
		System.out.println("TTL       : koto ringin,31 Maret 2000");
		System.out.println("Umur      : 20 Tahun");
		System.out.println("Fakultas  : TIF 1B Politeknik Kampar");
		System.out.println("Status    : Mahasiswa (Aktif)");
	}

	static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("Apakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			mulai();
		}else{
			penutup();
		}

	}
	static void penutup(){

		System.out.println();
		System.out.println("\tTerima Kasih Telah Menggunakan sistem kami");
	}	
}
