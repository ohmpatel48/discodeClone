package com.discode.serverservice.Service.impl;

import java.util.List;
import java.util.Optional;

import com.discode.serverservice.Repo.severRepo;
import com.discode.serverservice.Service.serv;
import com.discode.serverservice.entity.server;

public class servimple implements serv {

  severRepo serverRepo;

  @Override
  public server saveServer(server server) {
    return serverRepo.save(server);
  }

  @Override
  public void delete_server(String serverId) {
    serverRepo.deleteById(serverId);
  }

  @Override
  public Optional<server> getServer(String serverId) {
    return serverRepo.findById(serverId);
  }

  @Override
  public server updateServer(server server) {
    return serverRepo.save(server);
  }

  @Override
  public List<server> getall() {
    return serverRepo.findAll();
  }

}
