package com.edomahendra.IstidataTest.Service;

import java.util.List;

import com.edomahendra.IstidataTest.Model.Kendaraan;

public interface KendaraanService {
	
	List<Kendaraan> getAllKendaraan();
	void saveKendaraan(Kendaraan kendaraan);
	Kendaraan getKendaraanById(long id);
	void deleteKendaraanById(long id);

	

}
