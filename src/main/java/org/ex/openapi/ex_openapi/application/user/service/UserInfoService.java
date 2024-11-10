package org.ex.openapi.ex_openapi.application.user.service;

import lombok.extern.slf4j.Slf4j;
import org.ex.openapi.ex_openapi.application.common.entity.ResEntity;
import org.ex.openapi.ex_openapi.application.user.dto.UserEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.GetUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.PostUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.req.PutUserInfoReqEntity;
import org.ex.openapi.ex_openapi.application.user.entity.res.GetUserInfoResEntity;
import org.ex.openapi.ex_openapi.application.user.repostory.UserRepository;
import org.springframework.stereotype.Service;

/**
 * The type UserInfoService
 */
@Slf4j
@Service
public class UserInfoService {

    private final UserRepository userRepository;

    public UserInfoService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public GetUserInfoResEntity getUserInfo(GetUserInfoReqEntity reqEntity) {

        GetUserInfoResEntity resEntity = new GetUserInfoResEntity();
        resEntity.setCode("100");
        resEntity.setMessage("정상 처리 되었습니다.");

        UserEntity userEntity = userRepository.findByUserId(reqEntity.getUserId());
        if(userEntity != null){
            resEntity.setUserSq(userEntity.getUserSq());
            resEntity.setUserId(userEntity.getUserId());
            resEntity.setUserName(userEntity.getUserName());
        }else{
            resEntity.setCode("200");
            resEntity.setMessage("중복 아이디가 있습니다..");
            return resEntity;
        }

        return resEntity;
    }


    public ResEntity save(PostUserInfoReqEntity reqEntity) {
        ResEntity resEntity = new ResEntity();
        resEntity.setCode("100");
        resEntity.setMessage("정상 처리 되었습니다.");

        Boolean isExist = userRepository.existsByUserId(reqEntity.getUserId());
        if (isExist) {
            resEntity.setCode("200");
            resEntity.setMessage("중복 아이디가 있습니다..");
            return resEntity;
        }

        UserEntity data = new UserEntity();
        data.setUserId(reqEntity.getUserId());
        data.setUserName(reqEntity.getUserName());
        data.setUserPassword(reqEntity.getPassword());
        userRepository.save(data);
        return resEntity;
    }

    public ResEntity update(PutUserInfoReqEntity reqEntity) {
        ResEntity resEntity = new ResEntity();
        resEntity.setCode("100");
        resEntity.setMessage("정상 처리 되었습니다.");

        Boolean isExist = userRepository.existsByUserSq(reqEntity.getUserSq());

        if (isExist) {
            UserEntity data = new UserEntity();
            data.setUserId(reqEntity.getUserId());
            data.setUserName(reqEntity.getUserName());
            data.setUserSq(reqEntity.getUserSq());
            userRepository.save(data);
        }else{
            resEntity.setCode("200");
            resEntity.setMessage("회원정보가 없습니다.");
        }
        return resEntity;
    }

}
