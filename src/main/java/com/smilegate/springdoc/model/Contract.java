package com.smilegate.springdoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

public class Contract {

	@Schema(description = "", title = "contract_service_id", type = "array")
	private List<String> contractServiceId ;

    @Schema(description = "", name="contract_status", example = "1")
    private Integer ContractStatus;

	@Schema(description = "", name="product_no")
	private Long productNo;

    @Schema(description = "", name="search")
    private Integer search;

    @Schema(description = "", name="query")
    private String query;

	/**
	 * Get contract_service_id
	 *
	 * @return contract_service_id
	 **/
	@JsonProperty("contract_service_id")
	public List<String> getContractServiceId() {
		return contractServiceId;
	}

	public void setContractServiceId(List<String> contractServiceId) {
		this.contractServiceId = contractServiceId;
	}

	public Contract ContractServiceId(List<String> contractServiceId) {
		this.contractServiceId = contractServiceId;
		return this;
	}

	/**
	 * Get product_no
	 *
	 * @return product_no
	 **/
	@JsonProperty("productNo")
	public Long getProductNo() {
		return productNo;
	}

	public void setProductNo(Long productNo) {
		this.productNo = productNo;
	}

	public Contract productNo(Long productNo) {
		this.productNo = productNo;
		return this;
	}

/*
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Contract {\n");

		sb.append("    contract_service_id: ").append(toIndentedString(contractServiceId)).append("\n");
		sb.append("    product_no: ").append(toIndentedString(productNo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private static String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
*/
    @JsonProperty("contract_status")
    public Integer getContractStatus() {
        return ContractStatus;
    }

    @JsonProperty("search")
    public Integer getSearch() {
	    return search;
    }

    @JsonProperty("query")
    public String getQuery() {
	    return query;
    }
}
