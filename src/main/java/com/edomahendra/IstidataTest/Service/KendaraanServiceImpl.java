package com.edomahendra.IstidataTest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edomahendra.IstidataTest.Model.Kendaraan;
import com.edomahendra.IstidataTest.Repository.KendaraanRepository;

@Service
public class KendaraanServiceImpl implements KendaraanService{

	@Autowired
	private KendaraanRepository kendaraanRepository;
	
	@Override
	public List<Kendaraan> getAllKendaraan() {
		return kendaraanRepository.findAll();
	}

	@Override
	public void saveKendaraan(Kendaraan kendaraan) {
		this.kendaraanRepository.save(kendaraan);
		
	}

	@Override
	public Kendaraan getKendaraanById(long id) {
		Optional<Kendaraan> optional = kendaraanRepository.findById(id);
		Kendaraan kendaraan = null;
		if(optional.isPresent()) {
			kendaraan = optional.get();
		}else {
			throw new RuntimeException(" Data tidak ditemukan untuk ::" +id);
		}
		return kendaraan;	
	}

	@Override
	public void deleteKendaraanById(long id) {
		this.kendaraanRepository.deleteById(id);
	}

	
	



	

}
