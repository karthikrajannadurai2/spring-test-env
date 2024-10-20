package com.example.demo.TestPageAble;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "obie_account_consents")
public class AccountConsentsEntity implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "obie_account_consents_gen")
    @SequenceGenerator(name = "obie_account_consents_gen", sequenceName = "obie_account_consents_seq", allocationSize = 1)
    private long id;

    @Column(name = "consent_id")
    private String consentId;
    @Column(name = "exp_date_time")
    private OffsetDateTime expirationDateTime;
    @Column(name = "tx_from_date_time")
    private OffsetDateTime transactionFromDateTime;
    @Column(name = "tx_to_date_time")
    private OffsetDateTime transactionToDateTime;
    @Column
    private String status;
    @Column(name = "st_upt_date_time")
    private OffsetDateTime statusUpdateDateTime;
    @Column(name = "created_date_time")
    private OffsetDateTime creationDateTime;
    @Column(name = "psu_id")
    private String psuId;
    @Column(name = "client_id")
    private String clientId;
    @Column(name = "entity_id")
    private String entityId;
    @Column(name = "last_shared")
    private OffsetDateTime dataLastSharedDateTime;
    @Column(name = "tpp_name")
    private String tppOrganisationName;
    @Column(name = "first_access")
    private OffsetDateTime firstAccessDateTime;

    public AccountConsentsEntity() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OffsetDateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    public OffsetDateTime getTransactionFromDateTime() {
        return transactionFromDateTime;
    }

    public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
        this.transactionFromDateTime = transactionFromDateTime;
    }

    public OffsetDateTime getTransactionToDateTime() {
        return transactionToDateTime;
    }

    public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
        this.transactionToDateTime = transactionToDateTime;
    }

    public OffsetDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getPsuId() {
        return psuId;
    }

    public void setPsuId(String psuId) {
        this.psuId = psuId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public OffsetDateTime getDataLastSharedDateTime() {
        return dataLastSharedDateTime;
    }

    public void setDataLastSharedDateTime(OffsetDateTime dataLastSharedDateTime) {
        this.dataLastSharedDateTime = dataLastSharedDateTime;
    }

    public String getTppOrganisationName() {
        return tppOrganisationName;
    }

    public void setTppOrganisationName(String tppOrganisationName) {
        this.tppOrganisationName = tppOrganisationName;
    }

    public OffsetDateTime getFirstAccessDateTime() {
        return firstAccessDateTime;
    }

    public void setFirstAccessDateTime(OffsetDateTime firstAccessDateTime) {
        this.firstAccessDateTime = firstAccessDateTime;
    }

    @Override
    public String toString() {
        return "AccountConsentsEntity{" +
                "id=" + id +
                ", consentId='" + consentId + '\'' +
                ", expirationDateTime=" + expirationDateTime +
                ", transactionFromDateTime=" + transactionFromDateTime +
                ", transactionToDateTime=" + transactionToDateTime +
                ", status=" + status +
                ", statusUpdateDateTime=" + statusUpdateDateTime +
                ", creationDateTime=" + creationDateTime +
                ", psuId='" + psuId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", entityId='" + entityId + '\'' +
                ", dataLastSharedDateTime=" + dataLastSharedDateTime +
                ", tppOrganisationName='" + tppOrganisationName + '\'' +
                ", firstAccessDateTime=" + firstAccessDateTime +
                '}';
    }
}
