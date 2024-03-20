package org.ex.openapi.ex_openapi.application.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.ex.openapi.ex_openapi.application.common.entity.ResEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.GetUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.PostUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.PutUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.res.GetUserInfoResEntity;
import org.ex.openapi.ex_openapi.application.user.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Tag(name = "UserInfoController", description = "User Info Service")
@Controller
@ResponseBody
@RequestMapping("1.0/userInfo")
public class UserInfoController {

    // 기본형
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserInfoService userInfoService;
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @Operation(summary = "회원정보 조회", description = "100:성공 200:실패")
//    @ApiDocumentResponse
    @ResponseBody
    @GetMapping(value = "getUserInfo", produces = {MediaType.APPLICATION_JSON_VALUE})
    public GetUserInfoResEntity getUserInfo(@ParameterObject @ModelAttribute GetUserInfoReqEntity reqEntity)throws Exception {
        return userInfoService.getUserInfo(reqEntity);
    }

    @Operation(summary = "회원정보 가입", description = "100:성공, 200:실패")
//    @ApiDocumentResponse
    @ResponseBody
    @PostMapping(value = "save", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResEntity save(@ParameterObject @ModelAttribute PostUserInfoReqEntity reqEntity)throws Exception {
        return userInfoService.save(reqEntity);
    }

    @Operation(summary = "회원정보 수정 ", description = "100:성공, 200:실패")
//    @ApiDocumentResponse
    @ResponseBody
    @PutMapping(value = "update", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResEntity updateMember(@ParameterObject @ModelAttribute PutUserInfoReqEntity reqEntity) {
        return userInfoService.update(reqEntity);
    }


}
