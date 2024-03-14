package com.ti.lav.lavender.service;


import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.db.domain.Establishments;
import com.ti.lav.lavender.model.EstablishmentsDTO;
import org.springframework.stereotype.Service;

@Service
public class EstablishmentService extends BaseService {
    public EstablishmentsDTO saveEstablishemt(EstablishmentsDTO establishmentsDTO) throws BusinessException {
        Establishments e = new Establishments();
        return saveOrUpdate(establishmentsDTO, Establishments.class);
    }

    public EstablishmentsDTO getEstablishemt(long id) throws BusinessException {
        return getOne(Establishments.class, EstablishmentsDTO.class , id);
    }


}
