package com.discode.categories.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discode.categories.service.categoryservice;
import entity.categories;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/categories")
public class categorycontroller {

  categoryservice categoryService;

  @GetMapping("/{category_id}")
  public ResponseEntity<categories> getMethodName(@PathVariable String category_id) {
    return ResponseEntity.ok(categoryService.getCategoriesById(category_id));
  }

  @PostMapping("/")
  public ResponseEntity<categories> saveCatogry(@RequestBody categories entity) {
    return ResponseEntity.ok(categoryService.setCategories(entity));
  }

  @GetMapping("/")
  public ResponseEntity<List<categories>> getall() {
    return ResponseEntity.ok(categoryService.getCategories());
  }

  @GetMapping("/isPrivate")
  public ResponseEntity<Boolean> isPrivate(@RequestParam String category_id) {
    return ResponseEntity.ok(categoryService.isPrivateCategory(category_id));
  }

  @PostMapping("/delete/{category_id}")
  public void postMethodName(@PathVariable String category_id) {
    categoryService.deleteCategoriesById(category_id);
  }

}
