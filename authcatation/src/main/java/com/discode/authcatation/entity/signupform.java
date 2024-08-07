package com.discode.authcatation.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class signupform {

  private String user_name;
  private String user_email;
  private String user_password;
  private MultipartFile file;

}
