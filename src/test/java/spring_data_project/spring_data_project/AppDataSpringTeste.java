package spring_data_project.spring_data_project;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.InterfaceSpringDataUser;
import entities.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-config.xml")
public class AppDataSpringTeste {
	
	 @Autowired
	private InterfaceSpringDataUser userInterface;
	
	@Test
	public void findAll() {
		
	UsuarioSpringData user = new UsuarioSpringData("Jorge Eduardo", 22, "jorge@gmail.com");
	userInterface.save(user);
		
	}
}
