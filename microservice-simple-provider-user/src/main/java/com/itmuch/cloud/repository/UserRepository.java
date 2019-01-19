package com.itmuch.cloud.repository;

import com.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Samuel on 2017/7/4.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
