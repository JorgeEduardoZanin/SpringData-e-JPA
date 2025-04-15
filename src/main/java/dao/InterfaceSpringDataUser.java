package dao;

import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entities.UsuarioSpringData;
import jakarta.transaction.Transactional;

public interface InterfaceSpringDataUser extends CrudRepository<UsuarioSpringData, Long> {
	
	
	@Query(value = "SELECT u FROM UsuarioSpringData u WHERE u.id = :id")
	public UsuarioSpringData findId(@Param("id") Long id);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM UsuarioSpringData u WHERE u.name = ?1")
	public void deletarPorNome(String name);
	
}
