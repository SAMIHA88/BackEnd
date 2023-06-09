package ma.projet.demo.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.projet.demo.entities.Role;
import ma.projet.demo.entities.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findById(int id);	
	List<Role> findByUsers(User user);
	
	
}
