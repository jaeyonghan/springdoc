package com.smilegate.springdoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public class ContractResponse {

    @Schema(description = "", title = "total_count")
    private Integer totalCount = null;

    @Schema(description = "", name = "contract_list")
    private List<ContractList> contractList = null;

    @JsonProperty("tatal_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("contract_list")
    public List<ContractList> getContractList(){
        return  contractList;
    };

}

