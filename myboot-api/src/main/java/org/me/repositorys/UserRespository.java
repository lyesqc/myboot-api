package org.me.repositorys;

import org.me.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<UserEntity, String>{

	public UserEntity getByUsername(String username);
}
