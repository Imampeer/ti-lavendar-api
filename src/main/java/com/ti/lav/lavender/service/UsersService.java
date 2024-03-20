package com.ti.lav.lavender.service;

import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.db.domain.Users;
import com.ti.lav.lavender.db.repository.UsersRepository;
import com.ti.lav.lavender.model.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService extends BaseService {
    @Autowired
    private UsersRepository repository;

    public UsersDTO saveUsers(UsersDTO usersDTO) throws BusinessException {
        UsersDTO updatedUsersDTO = saveOrUpdate(usersDTO, Users.class);
        return updatedUsersDTO;
    }

    public UsersDTO getUsers(long id) throws BusinessException {
        UsersDTO usersDTO = getOne(Users.class, UsersDTO.class, id);
        return usersDTO;
    }

    public UsersDTO deleteUsers(Long id) throws BusinessException{
        return null;
    }
}
