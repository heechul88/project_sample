package org.ex.openapi.ex_openapi.application.common.entity;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Success"),
    @ApiResponse(responseCode = "400", description = "Bad Request",
        content = @Content(schema = @Schema(implementation = ResEntity.class),
            examples = {@ExampleObject(name = "ResEntity", value = "{\"code\": \"999\", \"message\": \"Bad Request\", \"subMessage\": \"Exception Error Message\"}")})),
    @ApiResponse(responseCode = "401", description = "StudyAnalysisEntity",
        content = @Content(schema = @Schema(implementation = ResEntity.class),
            examples = {@ExampleObject(name = "ResEntity", value = "{\"code\": \"999\", \"message\": \"Unauthorized\", \"subMessage\": \"Exception Error Message\"}")})),
    @ApiResponse(responseCode = "404", description = "Not Found",
        content = @Content(schema = @Schema(implementation = ResEntity.class),
            examples = {@ExampleObject(name = "ResEntity", value = "{\"code\": \"999\", \"message\": \"Page Not Found\", \"subMessage\": \"Exception Error Message\"}")})),
    @ApiResponse(responseCode = "500", description = "Internal Server Error",
        content = @Content(schema = @Schema(implementation = ResEntity.class),
            examples = {@ExampleObject(name = "ResEntity", value = "{\"code\": \"999\", \"message\": \"Internal Server Error\", \"subMessage\": \"Exception Error Message\"}")})),
})
public @interface ApiDocumentResponse {
}
