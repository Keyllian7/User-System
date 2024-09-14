package br.com.keyllian.project.domain.repository;

import br.com.keyllian.project.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
