package com.discode.channels.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.discode.channels.entity.channelsdata;

public interface channelrepo extends JpaRepository<channelsdata, String> {

}
