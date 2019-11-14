package com.smilegate.springdoc.api;

import com.smilegate.springdoc.model.Contract;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ContractApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.springdoc.demo.app2.codegen.languages.SpringCodegen", date = "2019-07-11T00:09:29.839+02:00[Europe/Paris]")

public interface ContractApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    default ResponseEntity<Contract> getContractInfo(Contract contract) {
        extract1();
        System.out.println("delegate 1");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    default void extract1() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}");
                    break;
                }

            }
        });
    }

}
