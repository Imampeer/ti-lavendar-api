package com.ti.lav.lavender.service;


import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.db.domain.BaseTransactionDomain;
import com.ti.lav.lavender.db.domain.EstServices;
import com.ti.lav.lavender.db.domain.Establishments;
import com.ti.lav.lavender.db.repository.EstablishmentRepository;
import com.ti.lav.lavender.model.EstServicesDTO;
import com.ti.lav.lavender.model.EstablishmentsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EstablishmentService extends BaseService {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    public EstablishmentsDTO saveEstablishemt(EstablishmentsDTO establishmentsDTO) throws BusinessException {
        EstablishmentsDTO updatedEstablishmentsDTO = saveOrUpdate(establishmentsDTO, Establishments.class);
        //Establishment Services
        updatedEstablishmentsDTO.getServices().forEach(dto->dto.setEstId(establishmentsDTO.getId()));
        List<EstServices> dbEstServices = establishmentRepository.getEstablishmentServices(updatedEstablishmentsDTO.getId());
        saveList(updatedEstablishmentsDTO.getServices(), dbEstServices, EstServices.class);

        return updatedEstablishmentsDTO;
    }

    public EstablishmentsDTO getEstablishemt(long id) throws BusinessException {
        EstablishmentsDTO establishmentsDTO = getOne(Establishments.class, EstablishmentsDTO.class , id);
        List<EstServices> dbEstServices = establishmentRepository.getEstablishmentServices(establishmentsDTO.getId());
        establishmentsDTO.setServices(Arrays.asList(modelMapper.map(dbEstServices, EstServicesDTO[].class)));
        return establishmentsDTO;
    }


}
