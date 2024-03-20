package com.ti.lav.lavender.service;

import com.ti.lav.lavender.common.BusinessException;
import com.ti.lav.lavender.db.domain.AppointmentBooking;
import com.ti.lav.lavender.db.domain.ApptBookingServices;
import com.ti.lav.lavender.db.repository.AppointmentBookingRepository;
import com.ti.lav.lavender.model.AppointmentBookingDTO;
import com.ti.lav.lavender.model.ApptBookingServicesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AppointmentBookingService extends BaseService {
    @Autowired
    private AppointmentBookingRepository bookingRepository;
    public AppointmentBookingDTO saveAppointmentBooking(AppointmentBookingDTO  appointmentBookingDTO) throws BusinessException {
        AppointmentBookingDTO  updatedAppointmentBookingDTO = saveOrUpdate(appointmentBookingDTO, AppointmentBooking.class);
        //Establishment Services
        appointmentBookingDTO.getServices().forEach(dto->dto.setBookingId(appointmentBookingDTO.getId()));
        List<ApptBookingServices> dbApptBookingServices = bookingRepository.getApptmentBookingServices(updatedAppointmentBookingDTO.getId());
        saveList(updatedAppointmentBookingDTO.getServices(), dbApptBookingServices, ApptBookingServices.class);

        return updatedAppointmentBookingDTO;
    }

    public AppointmentBookingDTO getAppointmentBooking(long id) throws BusinessException {
        AppointmentBookingDTO appointmentBookingDTO = getOne(AppointmentBooking.class, AppointmentBookingDTO.class , id);
        List<ApptBookingServices> dbApptBookingServices = bookingRepository.getApptmentBookingServices(appointmentBookingDTO.getId());
//        appointmentBookingDTO.setServices(Arrays.asList(modelMapper.map(dbApptBookingServices, ApptBookingServices[].class)));
        appointmentBookingDTO.setServices(Arrays.asList(modelMapper.map(dbApptBookingServices, ApptBookingServicesDTO[].class)));
        return appointmentBookingDTO;
    }

}



