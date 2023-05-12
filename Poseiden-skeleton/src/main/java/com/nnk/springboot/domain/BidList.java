package com.nnk.springboot.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "bidlist")
@NoArgsConstructor @AllArgsConstructor @Data
public class BidList {
    // TODO: Map columns in data table BIDLIST with corresponding java fields
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer BidListId;
    @NotBlank(message = "type is mandatory")
    private String type;
    @NotBlank(message = "bidQuantity is mandatory")
    private Double bidQuantity;
    @NotBlank(message = "Role is mandatory")
    private Double askQuantity;
    @NotBlank(message = "bid is mandatory")
    private Double bid;
    @NotBlank(message = "Role is mandatory")
    private Double ask;
    @NotBlank(message = "benchmark is mandatory")
    private String benchmark;
    @NotBlank(message = "Role is mandatory")
    private Timestamp bidListDate;
    @NotBlank(message = "commentary is mandatory")
    private String commentary;
    @NotBlank(message = "security is mandatory")
    private String security;
    @NotBlank(message = "Role is mandatory")
    private String status;
    @NotBlank(message = "Role is mandatory")
    private String trader;
    @NotBlank(message = "Role is mandatory")

    private String book;
    @NotBlank(message = "creationName is mandatory")
    private String creationName;
    @NotBlank(message = "creationDate is mandatory")
    private Timestamp creationDate;
    @NotBlank(message = "revisionName is mandatory")
    private String revisionName;
    @NotBlank(message = "revisionDate is mandatory")
    private Timestamp revisionDate;
    @NotBlank(message = "dealName is mandatory")
    private String dealName;
    @NotBlank(message = "dealType is mandatory")
    private String dealType;
    @NotBlank(message = "sourceListId is mandatory")
    private String sourceListId;
    @NotBlank(message = "side is mandatory")
    private String side;


}
