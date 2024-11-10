package org.ex.openapi.ex_openapi.application.user.entity.req;


import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.ex.openapi.ex_openapi.application.common.entity.ReqEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class PutUserInfoReqEntity extends ReqEntity {

    @Parameter(description = "회원일련번호", example = "1", required = true)
    private int userSq;

    @Parameter(description = "회원이름", example = "홍길동", required = true)
    private String userName;

    @Parameter(description = "비밀번호", example = "dapdjwpaoj", required = true)
    private String password;

    @Parameter(description = "회원아이디", example = "dapdjwpaoj", required = true)
    private String userId;

}
