// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.itg.soabus.logistic.domain;

import com.itg.soabus.logistic.domain.SupplierAppInfo;
import com.itg.soabus.logistic.domain.SupplierAppInfoKey;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect SupplierAppInfo_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager SupplierAppInfo.entityManager;
    
    public static final EntityManager SupplierAppInfo.entityManager() {
        EntityManager em = new SupplierAppInfo().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long SupplierAppInfo.countSupplierAppInfoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM SupplierAppInfo o", Long.class).getSingleResult();
    }
    
    public static List<SupplierAppInfo> SupplierAppInfo.findAllSupplierAppInfoes() {
        return entityManager().createQuery("SELECT o FROM SupplierAppInfo o", SupplierAppInfo.class).getResultList();
    }
    
    public static SupplierAppInfo SupplierAppInfo.findSupplierAppInfo(SupplierAppInfoKey key) {
        if (key == null) return null;
        return entityManager().find(SupplierAppInfo.class, key);
    }
    
    public static List<SupplierAppInfo> SupplierAppInfo.findSupplierAppInfoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM SupplierAppInfo o", SupplierAppInfo.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void SupplierAppInfo.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void SupplierAppInfo.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            SupplierAppInfo attached = SupplierAppInfo.findSupplierAppInfo(this.key);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void SupplierAppInfo.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void SupplierAppInfo.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public SupplierAppInfo SupplierAppInfo.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        SupplierAppInfo merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
