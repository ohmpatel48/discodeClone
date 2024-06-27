package com.discode.serverservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class server {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  public String server_id;
  public String server_name;
  public String server_profileUrl;
  public String server_InviteString;

  public Server_type server_type;

}
