package com.ti.lav.lavender.service;

import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.db.dao.GenericDAO;
import com.ti.lav.lavender.db.domain.BaseTransactionDomain;
import com.ti.lav.lavender.model.BaseTransactionDTO;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class BaseService {

    @Autowired
    protected GenericDAO genericDAO;

    @Autowired
    protected ModelMapper modelMapper;

    private <S> S getDBObject(Class S, long id) throws BusinessException {
        S dbObj = (S) genericDAO.findOne(S, id);
        if(dbObj==null){
            throw new BusinessException("Record not found");
        }
        return dbObj;
    }

    @Transactional
    protected <T> T saveOrUpdate(T dto, Class<? extends BaseTransactionDomain> domainClass) throws BusinessException {
        try {
            BaseTransactionDomain dbObj = null;
            BaseTransactionDTO bdto = (BaseTransactionDTO) dto;
            log.info("Saving domain object saved for "+ domainClass +" ID: "+ bdto.getId() );
            if (bdto.getId() > 0) {
                dbObj = getDBObject(domainClass, bdto.getId());
                modelMapper.map(dto,dbObj);
            } else {
                dbObj = (BaseTransactionDomain) modelMapper.map(dto,domainClass);
            }
            genericDAO.save(dbObj);
            bdto.setId(dbObj.getId());
            log.info("Saved object saved for "+ domainClass +" ID: "+ bdto.getId() );
            return (T) bdto;
        }
        catch (BusinessException e){
            throw e;
        }
        catch (Exception e){
            log.error("Error in saving object", e);
            throw new BusinessException("Error in saving object");
        }
    }

    protected <S,T> T getOne(Class S,Class T, long id) throws BusinessException {
        Object dbObj = getDBObject(S, id);
        return (T) modelMapper.map(dbObj,T);
    }

}
