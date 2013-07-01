// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.itg.soabus.contract.domain;

import com.itg.soabus.contract.domain.TradeContract;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect TradeContract_Roo_Finder {
    
    public static TypedQuery<TradeContract> TradeContract.findTradeContractsByContractNoEquals(String contractNo) {
        if (contractNo == null || contractNo.length() == 0) throw new IllegalArgumentException("The contractNo argument is required");
        EntityManager em = TradeContract.entityManager();
        TypedQuery<TradeContract> q = em.createQuery("SELECT o FROM TradeContract AS o WHERE o.contractNo = :contractNo", TradeContract.class);
        q.setParameter("contractNo", contractNo);
        return q;
    }
    
}
