package dao;

import org.springframework.data.repository.CrudRepository;


import entities.UsuarioSpringData;


public interface InterfaceSpringDataUser extends CrudRepository<UsuarioSpringData, Long> {}
