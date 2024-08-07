package com.discode.authcatation.config;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class uploadimageconfig {

  @Value("${cloudinary.cloud_name}")
  private String cloudName;

  @Value("${cloudinary.api_key}")
  private String apiKey;

  @Value("${cloudinary.api_secret}")
  private String apiSecret;

  @Bean
  public Cloudinary cloudinary() {
    Map<String, String> config = ObjectUtils.asMap(
        "cloud_name", cloudName,
        "api_key", apiKey,
        "api_secret", apiSecret,
        "secure", true);
    return new Cloudinary(config);
  }
}