package org.ex.openapi.ex_openapi.application;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1")
//@Tag(name = "Template", description = "템플릿 API Document")
public class MainController {
//    @RestController는 @Controller에 @ResponseBody가 추가된 것입니다.
//    API를 만들거기때문에 RestController 선언해서 사용할 예정입니다.

    @GetMapping("/main")
    @Operation(summary = "test", description = "테스트 API 입니다.")
    public String main(){
        return "ex_openApi";
    }

}
