package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

  @GetMapping
  public ResponseEntity<?> hello(OAuth2AuthenticationToken currentUser) {
    OAuth2User principal = currentUser.getPrincipal();
    System.out.println(principal);
    return ResponseEntity.ok(currentUser);
  }

}
