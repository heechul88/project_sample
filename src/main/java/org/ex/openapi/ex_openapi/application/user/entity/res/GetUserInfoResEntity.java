package org.ex.openapi.ex_openapi.application.user.entity.res;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.ex.openapi.ex_openapi.application.common.entity.ResEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class GetUserInfoResEntity extends ResEntity {

    @Schema(description = "유저 아이디")
    private String userId;

    @Schema(description = "유저 이름")
    private String userName;

    @Schema(description = "유저 일련번호")
    private int userSq;

}
