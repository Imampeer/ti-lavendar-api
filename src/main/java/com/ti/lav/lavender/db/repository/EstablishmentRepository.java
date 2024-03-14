package com.ti.lav.lavender.db.repository;

import com.ti.lav.lavender.db.domain.EstServices;
import com.ti.lav.lavender.db.domain.Establishments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstablishmentRepository extends JpaRepository <Establishments, Long>{

    @Query("SELECT es FROM EstServices es where estId=:establishmentId ")
    List<EstServices> getEstablishmentServices(Long establishmentId);

}
