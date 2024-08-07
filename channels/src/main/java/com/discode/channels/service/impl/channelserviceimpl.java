package com.discode.channels.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.discode.channels.entity.channelsdata;
import com.discode.channels.repo.channelrepo;
import com.discode.channels.service.channel_service;

@Service
public class channelserviceimpl implements channel_service {

  channelrepo channelrepo;

  @Override
  public channelsdata saveChannelsdata(channelsdata channelsdata) {
    return channelrepo.save(channelsdata);
  }

  @Override
  public void delete_channel(String channel_id) {
    channelrepo.deleteById(channel_id);
  }

  @Override
  public Optional<channelsdata> getChannel(String channel_id) {
    return channelrepo.findById(channel_id);
  }

  @Override
  public channelsdata updateChannel(channelsdata channelsdata) {
    return channelrepo.save(channelsdata);
  }

  @Override
  public boolean isPrivate(String channel_id) {
    return channelrepo.findById(channel_id).get().isChannel_private();
  }

  @Override
  public List<channelsdata> getall() {
    return channelrepo.findAll();
  }

}
