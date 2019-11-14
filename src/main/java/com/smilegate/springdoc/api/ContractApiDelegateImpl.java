package com.smilegate.springdoc.api;

import com.smilegate.springdoc.model.Contract;
import com.smilegate.springdoc.repository.ContractRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

@Service
public class ContractApiDelegateImpl implements ContractApiDelegate {

	private final ContractRepository contractRepository;

	private final NativeWebRequest request;

	public ContractApiDelegateImpl(ContractRepository contractRepository, NativeWebRequest request) {
		this.contractRepository = contractRepository;
		this.request = request;
	}

	@Override
	public ResponseEntity<Contract> getContractInfo(Contract contract){
        return new ResponseEntity<>(HttpStatus.OK);
	}

}
