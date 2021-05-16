package com.meensat.repository;

import org.springframework.data.repository.CrudRepository;

import com.meensat.Usersmodel.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {

}
