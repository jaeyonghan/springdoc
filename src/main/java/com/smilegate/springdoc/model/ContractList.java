package com.smilegate.springdoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContractList {

	@JsonProperty("contract_no")
	Long contractNo;

	@JsonProperty("contract_key")
	String contractKey;

	@JsonProperty("contract_nm")
	String contractNm;

	@JsonProperty("contract_service_id")
	String contractServiceId;

	@JsonProperty("category")
	Integer category;

	@JsonProperty("product_no")
	Long productNo;

	@JsonProperty("product_type")
	Integer productType;

	@JsonProperty("start_dt")
	String startDt;

	@JsonProperty("end_dt")
	String endDt;

	@JsonProperty("contract_status")
	Integer contractStatus;

	@JsonProperty("contract_amount")
	Long contractAmount;

	@JsonProperty("contract_count")
	Long contractCount;

	@JsonProperty("event_no")
	Long eventNo;

	@JsonProperty("test_contract_cd")
	Integer testContractCd;

	@JsonProperty("reg_dt")
	String regDt;

	@JsonProperty("upd_dt")
	String updDt;

	@JsonProperty("reg_member_no")
	Long regMemberNo;

	@JsonProperty("upd_member_no")
	Long updMemberNo;
}
