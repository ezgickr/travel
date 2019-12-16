package com.zgckrk.travel.travel.springData;

import com.zgckrk.travel.travel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataRepository extends JpaRepository<User,Long> {

}
