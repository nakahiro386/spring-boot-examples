package io.github.nakahiro386.spring.boot.example.batch.dto;

import lombok.Data;

@Data
public class AdAddress {
  private Integer id;
  private Integer kenId;
  private Integer cityId;
  private Integer townId;
  private String zip;
  private Integer officeFlg;
  private Integer deleteFlg;
  private String kenName;
  private String kenFuri;
  private String cityName;
  private String cityFuri;
  private String townName;
  private String townFuri;
  private String townMemo;
  private String kyotoStreet;
  private String blockName;
  private String blockFuri;
  private String memo;
  private String officeName;
  private String officeFuri;
  private String officeAddress;
  private Integer newId;
}
