package com.discode.serverservice.contoller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discode.serverservice.Service.impl.servimple;
import com.discode.serverservice.entity.server;

@RestController
@RequestMapping("/server")
public class serverContoller {

  servimple serverService;

  @GetMapping("/{serverId}")
  public ResponseEntity<Optional<server>> getUserdetails(@PathVariable String serverId) {
    return ResponseEntity.ok(serverService.getServer(serverId));
  }

  @PostMapping("/update")
  public ResponseEntity<server> updateuser(@RequestBody server entity) {
    return ResponseEntity.ok(serverService.updateServer(entity));
  }

  @PostMapping
  public ResponseEntity<server> createuser(@RequestBody server entity) {
    return ResponseEntity.ok(serverService.saveServer(entity));
  }

  @GetMapping("/delete/{serverId}")
  public ResponseEntity<String> deleteuser(@PathVariable String serverId) {
    serverService.delete_server(serverId);
    return ResponseEntity.ok("Server Deleted");
  }

}
