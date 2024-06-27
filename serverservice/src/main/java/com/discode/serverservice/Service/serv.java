package com.discode.serverservice.Service;

import java.util.List;
import java.util.Optional;

import com.discode.serverservice.entity.server;

public interface serv {

  server saveServer(server server);

  void delete_server(String serverId);

  Optional<server> getServer(String serverId);

  server updateServer(server server);

  List<server> getall();

}
