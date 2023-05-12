package com.nnk.springboot.domain;

//import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Entity
@Table(name = "curvepoint")
@NoArgsConstructor @AllArgsConstructor @Data

public class CurvePoint {
    // TODO: Map columns in data table CURVEPOINT with corresponding java fields
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Integer id;
private  Integer curveId;
private  Timestamp asOfDate;
private  Double term;
private  Double value;
private  Timestamp creationDate;
}
