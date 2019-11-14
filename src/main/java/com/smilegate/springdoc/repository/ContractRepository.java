package com.smilegate.springdoc.repository;

import com.smilegate.springdoc.model.Contract;
import org.springframework.stereotype.Repository;

@Repository
public class ContractRepository extends HashMapRepository<Contract, String> {

    private Long sequenceId = 1L;

    @Override
    <S extends Contract> String getEntityId(S Contract) {
        return "test";
    }

}
