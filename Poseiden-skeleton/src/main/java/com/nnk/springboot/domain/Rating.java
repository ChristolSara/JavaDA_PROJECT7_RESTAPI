package com.nnk.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "rating")
@NoArgsConstructor @AllArgsConstructor
public class Rating {
    // TODO: Map columns in data table RATING with corresponding java fields
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Integer id;
  private  String moodysRating;
  private  String sandPRating;
  private  String fitchRating;
  private  Integer orderNumber;
}
