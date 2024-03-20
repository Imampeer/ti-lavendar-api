package com.ti.lav.lavender.controller;

import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.model.UsersDTO;
import com.ti.lav.lavender.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    @Autowired
   private UsersService usersService;

    @PostMapping("/saveUsers")
    public UsersDTO saveUsers(@RequestBody UsersDTO usersDTO) throws BusinessException {
        return usersService.saveUsers(usersDTO);
    }

    @PostMapping("/getUsers/{id}")
    public UsersDTO getUsers(@PathVariable Long id) throws BusinessException {
        return usersService.getUsers(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public UsersDTO deleteUsers(@PathVariable Long id) throws BusinessException {
      //  return usersService.deleteUsers(id);
        return null;
    }


}


