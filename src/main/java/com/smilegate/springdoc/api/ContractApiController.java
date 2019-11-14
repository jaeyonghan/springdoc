package com.smilegate.springdoc.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@javax.annotation.Generated(value = "org.springdoc.demo.app2.codegen.languages.SpringCodegen", date = "2019-07-11T00:09:29.839+02:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.openAPIPetstore.base-path:/}")
public class ContractApiController implements ContractApi {

    private final ContractApiDelegate delegate;

    public ContractApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ContractApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ContractApiDelegate() {});
    }

    @Override
    public ContractApiDelegate getDelegate1() {
        return delegate;
    }

}
