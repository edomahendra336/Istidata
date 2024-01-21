package com.edomahendra.IstidataTest.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="kendaraan")
public class Kendaraan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="noreg")
	private String noreg;
	@Column(name="nama")
	private String nama;
	@Column(name="alamat")
	private String alamat;
	@Column(name="merk")
	private String merk;
	@Column(name="tahun")
	private String tahun;
	@Column(name="kapasitas")
	private int kapasitas;
	@Column(name="warna")
	private String warna;
	@Column(name="bahanbakar")
	private String bahanbakar;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNoreg() {
		return noreg;
	}
	public void setNoreg(String noreg) {
		this.noreg = noreg;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getTahun() {
		return tahun;
	}
	public void setTahun(String tahun) {
		this.tahun = tahun;
	}
	public int getKapasitas() {
		return kapasitas;
	}
	public void setKapasitas(int kapasitas) {
		this.kapasitas = kapasitas;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public String getBahanbakar() {
		return bahanbakar;
	}
	public void setBahanbakar(String bahanbakar) {
		this.bahanbakar = bahanbakar;
	}
	

}
