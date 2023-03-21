package com.brian.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.brian.springboot.app.models.entity.Cliente;

public interface IClientesDao extends PagingAndSortingRepository<Cliente, Long>{


}

