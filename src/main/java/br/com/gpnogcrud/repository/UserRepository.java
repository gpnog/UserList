package br.com.gpnogcrud.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.gpnogcrud.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public Long countById(Integer id);
}
