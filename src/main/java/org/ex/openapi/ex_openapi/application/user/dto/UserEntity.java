package org.ex.openapi.ex_openapi.application.user.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "USER_INFO")
@Data
public class UserEntity {
    /* 테이블 */
    /* 쿼리에 들어갈 테이블 컬럼들 */
    /* IDENTITY : AUTO_INCREMENT*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_SQ")
    private int userSq;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

}
