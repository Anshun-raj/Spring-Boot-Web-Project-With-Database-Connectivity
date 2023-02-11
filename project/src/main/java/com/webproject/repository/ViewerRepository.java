package com.webproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.entity.ViewerData;
public interface ViewerRepository extends JpaRepository<ViewerData,Integer> {

}
