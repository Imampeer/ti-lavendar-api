package com.ti.lav.lavender.db.repository;

import com.ti.lav.lavender.db.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {

}
