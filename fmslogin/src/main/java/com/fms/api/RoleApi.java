/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.fms.api;

import com.fms.entity.DashBoard;
import com.fms.model.EventSummary1;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import reactor.core.publisher.Mono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-22T18:02:22.909+05:30[Asia/Calcutta]")
@Api(value = "role", description = "the role API")
public interface RoleApi {

    Logger log = LoggerFactory.getLogger(RoleApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "role", notes = "assign the user role", response = String.class, tags={ "fms login", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "role assigned successfully", response = String.class),
        @ApiResponse(code = 404, message = "No user found") })
    @RequestMapping(value = "/role/{emailId}/{token}",
        produces = { "application/text" }, 
        method = RequestMethod.PUT)
    default Mono<ResponseEntity<String>> role(@ApiParam(value = "",required=true) @PathVariable("token") String token
,@ApiParam(value = "",required=true) @PathVariable("emailId") String emailId
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return Mono.just(new ResponseEntity<>( HttpStatus.NOT_IMPLEMENTED));
                } catch (Exception e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return Mono.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default RoleApi interface so no example is generated");
        }
        return Mono.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
    }

}
