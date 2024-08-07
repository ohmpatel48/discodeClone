package com.discode.categories.service;

import java.util.List;

import entity.categories;

public interface categoryservice {

  List<categories> getCategories();

  categories setCategories(categories categories);

  categories updateCategories(categories categories);

  void deleteCategoriesById(String id);

  categories getCategoriesById(String id);

  boolean isPrivateCategory(String id);

}
