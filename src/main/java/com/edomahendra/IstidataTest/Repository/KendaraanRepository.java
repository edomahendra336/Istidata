package com.edomahendra.IstidataTest.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.edomahendra.IstidataTest.Model.Kendaraan;

@Repository
public interface KendaraanRepository extends JpaRepository<Kendaraan, Long> {

	


}
