package com.sunbuck.cloud.dao;

import com.sunbuck.cloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sunbuck on 2017/4/25.
 */


/*
* 爲了直接使用JpaRepository接口,不必自己再写接口
* */

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
