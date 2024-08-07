package com.discode.categories.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.discode.categories.repo.categoryrepo;
import com.discode.categories.service.categoryservice;

import entity.categories;

@Service
public class categoryserviceimpl implements categoryservice {

  categoryrepo categoryrepo;

  @Override
  public List<categories> getCategories() {
    return categoryrepo.findAll();
  }

  @Override
  public categories setCategories(categories categories) {
    return categoryrepo.save(categories);
  }

  @Override
  public categories updateCategories(categories categories) {
    return categoryrepo.save(categories);
  }

  @Override
  public void deleteCategoriesById(String id) {
    categoryrepo.deleteById(id);
  }

  @Override
  public categories getCategoriesById(String id) {
    return categoryrepo.findById(id).get();
  }

  @Override
  public boolean isPrivateCategory(String id) {
    return categoryrepo.findById(id).get().getIsPrivate();
  }

}
