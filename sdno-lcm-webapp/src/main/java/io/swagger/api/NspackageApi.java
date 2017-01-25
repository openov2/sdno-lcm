package io.swagger.api;

import io.swagger.model.PackageManagementResponse;
import io.swagger.model.PackageOnboardRequest;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-11T11:14:05.407Z")

@Api(value = "nspackage", description = "the nspackage API")
public interface NspackageApi {

    @ApiOperation(value = "delete a NS package from SDN-O", notes = "it will delete a (onboarded) NS package from SDN-O.", response = PackageManagementResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "delete SDN-O NS package success.", response = PackageManagementResponse.class),
        @ApiResponse(code = 400, message = "delete SDN-O NS package failure as parameters invalid.", response = PackageManagementResponse.class),
        @ApiResponse(code = 401, message = "unauthorized.", response = PackageManagementResponse.class),
        @ApiResponse(code = 404, message = "delete SDN-O NS package failure as can't reach server.", response = PackageManagementResponse.class),
        @ApiResponse(code = 500, message = "delete SDN-O NS package failure as inner error.", response = PackageManagementResponse.class) })
    @RequestMapping(value = "/nspackage/{csarid}",
        produces = { "application/json;charset=UTF-8" }, 
        consumes = { "application/json;charset=UTF-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<PackageManagementResponse> packageDeletionDelete(@ApiParam(value = "ID of the NS package to be deleted from SDN-O",required=true ) @PathVariable("csarid") String csarid);


    @ApiOperation(value = "onboarding a NS package", notes = "it will onboarding a NS package to SDN-O.", response = PackageManagementResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "onboarding successfully.", response = PackageManagementResponse.class),
        @ApiResponse(code = 400, message = "onboarding SDN-O NS package failure as parameters invalid.", response = PackageManagementResponse.class),
        @ApiResponse(code = 401, message = "unauthorized.", response = PackageManagementResponse.class),
        @ApiResponse(code = 404, message = "onboarding SDN-O NS package failure as can't reach server.", response = PackageManagementResponse.class),
        @ApiResponse(code = 500, message = "onboarding SDN-O NS package failure as internal error.", response = PackageManagementResponse.class) })
    @RequestMapping(value = "/nspackage",
        produces = { "application/json;charset=UTF-8" }, 
        consumes = { "application/json;charset=UTF-8" },
        method = RequestMethod.POST)
    ResponseEntity<PackageManagementResponse> packageOnboardingPost(@ApiParam(value = "the request used to onboard a NS package to SDN-O" ,required=true ) @RequestBody PackageOnboardRequest nsRequest);

}
