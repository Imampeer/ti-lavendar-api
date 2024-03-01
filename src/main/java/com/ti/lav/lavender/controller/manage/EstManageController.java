package com.ti.lav.lavender.controller.manage;

import com.ti.lav.lavender.model.dto.EstSearchCriteriaDTO;
import com.ti.lav.lavender.model.dto.EstablishmentsDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/manage/est/")
public class EstManageController {

    @PostMapping("/getEst/{id}")
    public EstablishmentsDTO getEstablishemt(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/saveEst")
    public Boolean saveEstablishemt(@RequestBody EstablishmentsDTO establishmentsDTO) {
        return null;
    }


}
