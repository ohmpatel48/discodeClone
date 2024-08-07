package com.discode.channels.service;

import java.util.List;
import java.util.Optional;

import com.discode.channels.entity.channelsdata;

public interface channel_service {

  channelsdata saveChannelsdata(channelsdata channelsdata);

  void delete_channel(String channel_idString);

  Optional<channelsdata> getChannel(String channel_id);

  channelsdata updateChannel(channelsdata channelsdata);

  boolean isPrivate(String channel_id);

  List<channelsdata> getall();
}
