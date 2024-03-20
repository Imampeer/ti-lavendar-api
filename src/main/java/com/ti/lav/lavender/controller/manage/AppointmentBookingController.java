package com.ti.lav.lavender.controller.manage;

import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.model.AppointmentBookingDTO;
import com.ti.lav.lavender.model.UsersDTO;
import com.ti.lav.lavender.service.AppointmentBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppointmentBookingController {
    @Autowired
    private AppointmentBookingService appointmentBookingService;

    @PostMapping("/getAppointment/{id}")
    public AppointmentBookingDTO getAppointment(@PathVariable Long id) throws BusinessException {
        return appointmentBookingService.getAppointmentBooking(id);
    }

    @PostMapping("/appointment/save")
    public AppointmentBookingDTO saveAppointment(@RequestBody AppointmentBookingDTO appointmentBookingDTO) throws BusinessException {
        return appointmentBookingService.saveAppointmentBooking(appointmentBookingDTO);
    }
    @DeleteMapping("/deleteBooking/{id}")
    public AppointmentBookingDTO deleteAppointmentBooking(@PathVariable Long id) throws BusinessException {
        //  return usersService.deleteUsers(id);
        return null;
    }
}
