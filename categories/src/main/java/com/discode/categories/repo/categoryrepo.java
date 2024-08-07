package com.discode.categories.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.categories;

@Repository
public interface categoryrepo extends JpaRepository<categories, String> {

}
