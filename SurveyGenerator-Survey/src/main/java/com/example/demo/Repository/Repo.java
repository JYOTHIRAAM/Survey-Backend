package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mEntity.Form;
public interface Repo extends JpaRepository<Form,Integer>{

}