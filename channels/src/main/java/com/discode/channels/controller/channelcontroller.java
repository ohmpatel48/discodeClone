package com.discode.channels.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discode.channels.entity.channelsdata;
import com.discode.channels.service.impl.channelserviceimpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/channels")
public class channelcontroller {

  channelserviceimpl channelserviceimpl;

  @GetMapping("/{channel_id}")
  public ResponseEntity<channelsdata> getChannel(@PathVariable String channel_id) {
    return ResponseEntity.ok(channelserviceimpl.getChannel(channel_id).get());
  }

  @GetMapping("/isprivate/{channel_id}")
  public ResponseEntity<Boolean> getisPrivate(@PathVariable String channel_id) {
    return ResponseEntity.ok(channelserviceimpl.isPrivate(channel_id));
  }

  @PostMapping("/update")
  public ResponseEntity<channelsdata> updatechannel(@RequestBody channelsdata entity) {
    return ResponseEntity.ok(channelserviceimpl.updateChannel(entity));
  }

  @PostMapping
  public ResponseEntity<channelsdata> createchannel(@RequestBody channelsdata entity) {
    return ResponseEntity.ok(channelserviceimpl.saveChannelsdata(entity));
  }

  @GetMapping("/delete/{channel_id}")
  public void deletechannel(@PathVariable String channel_id) {
    channelserviceimpl.delete_channel(channel_id);
  }

  @GetMapping
  public ResponseEntity<List<channelsdata>> getallusers() {
    return ResponseEntity.ok(channelserviceimpl.getall());
  }

}
