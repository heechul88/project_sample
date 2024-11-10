package org.ex.openapi.ex_openapi.application.user.repostory;

import org.ex.openapi.ex_openapi.application.user.dto.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUserId(String userId);

    boolean existsByUserId(String userId);

    boolean existsByUserSq(int userSq);

}