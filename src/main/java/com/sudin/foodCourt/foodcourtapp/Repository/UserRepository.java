package com.sudin.foodCourt.foodcourtapp.Repository;

import com.sudin.foodCourt.foodcourtapp.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
Users findById(long id);
}
