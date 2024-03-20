package org.ex.openapi.ex_openapi.application.user.entity.req;


import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.ex.openapi.ex_openapi.application.common.entity.ReqEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class GetUserInfoReqEntity extends ReqEntity {

    @Parameter(description = "회원아이디", example = "dapdjwpaoj", required = true)
    private String userId;

}
