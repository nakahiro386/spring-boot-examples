package io.github.nakahiro386.spring.boot.example.domain.entity;

import io.github.nakahiro386.spring.boot.example.fw.domain.entity.AbstractAuditableEntity;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Addresses extends AbstractAuditableEntity {
    private Integer adAddressId;

    private String prefectureCode;

    private String cityCode;

    private String zipCode;

    private String officeFlg;

    private String deleteFlg;

    private String prefectureName;

    private String prefectureNameKana;

    private String cityName;

    private String cityNameKana;

    private String townAreaName;

    private String townAreaNameKana;

    private String townAreaMemo;

    private String cityBlockName;

    private String cityBlockNameKana;

    private String memo;

    private String officeName;

    private String officeNameKana;

    private String officeOfficeAddress;

    private Integer newAdAddressId;

    public Integer getAdAddressId() {
        return adAddressId;
    }

    public Addresses withAdAddressId(Integer adAddressId) {
        this.setAdAddressId(adAddressId);
        return this;
    }

    public void setAdAddressId(Integer adAddressId) {
        this.adAddressId = adAddressId;
    }

    public String getPrefectureCode() {
        return prefectureCode;
    }

    public Addresses withPrefectureCode(String prefectureCode) {
        this.setPrefectureCode(prefectureCode);
        return this;
    }

    public void setPrefectureCode(String prefectureCode) {
        this.prefectureCode = prefectureCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public Addresses withCityCode(String cityCode) {
        this.setCityCode(cityCode);
        return this;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Addresses withZipCode(String zipCode) {
        this.setZipCode(zipCode);
        return this;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getOfficeFlg() {
        return officeFlg;
    }

    public Addresses withOfficeFlg(String officeFlg) {
        this.setOfficeFlg(officeFlg);
        return this;
    }

    public void setOfficeFlg(String officeFlg) {
        this.officeFlg = officeFlg;
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public Addresses withDeleteFlg(String deleteFlg) {
        this.setDeleteFlg(deleteFlg);
        return this;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public Addresses withPrefectureName(String prefectureName) {
        this.setPrefectureName(prefectureName);
        return this;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }

    public String getPrefectureNameKana() {
        return prefectureNameKana;
    }

    public Addresses withPrefectureNameKana(String prefectureNameKana) {
        this.setPrefectureNameKana(prefectureNameKana);
        return this;
    }

    public void setPrefectureNameKana(String prefectureNameKana) {
        this.prefectureNameKana = prefectureNameKana;
    }

    public String getCityName() {
        return cityName;
    }

    public Addresses withCityName(String cityName) {
        this.setCityName(cityName);
        return this;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityNameKana() {
        return cityNameKana;
    }

    public Addresses withCityNameKana(String cityNameKana) {
        this.setCityNameKana(cityNameKana);
        return this;
    }

    public void setCityNameKana(String cityNameKana) {
        this.cityNameKana = cityNameKana;
    }

    public String getTownAreaName() {
        return townAreaName;
    }

    public Addresses withTownAreaName(String townAreaName) {
        this.setTownAreaName(townAreaName);
        return this;
    }

    public void setTownAreaName(String townAreaName) {
        this.townAreaName = townAreaName;
    }

    public String getTownAreaNameKana() {
        return townAreaNameKana;
    }

    public Addresses withTownAreaNameKana(String townAreaNameKana) {
        this.setTownAreaNameKana(townAreaNameKana);
        return this;
    }

    public void setTownAreaNameKana(String townAreaNameKana) {
        this.townAreaNameKana = townAreaNameKana;
    }

    public String getTownAreaMemo() {
        return townAreaMemo;
    }

    public Addresses withTownAreaMemo(String townAreaMemo) {
        this.setTownAreaMemo(townAreaMemo);
        return this;
    }

    public void setTownAreaMemo(String townAreaMemo) {
        this.townAreaMemo = townAreaMemo;
    }

    public String getCityBlockName() {
        return cityBlockName;
    }

    public Addresses withCityBlockName(String cityBlockName) {
        this.setCityBlockName(cityBlockName);
        return this;
    }

    public void setCityBlockName(String cityBlockName) {
        this.cityBlockName = cityBlockName;
    }

    public String getCityBlockNameKana() {
        return cityBlockNameKana;
    }

    public Addresses withCityBlockNameKana(String cityBlockNameKana) {
        this.setCityBlockNameKana(cityBlockNameKana);
        return this;
    }

    public void setCityBlockNameKana(String cityBlockNameKana) {
        this.cityBlockNameKana = cityBlockNameKana;
    }

    public String getMemo() {
        return memo;
    }

    public Addresses withMemo(String memo) {
        this.setMemo(memo);
        return this;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getOfficeName() {
        return officeName;
    }

    public Addresses withOfficeName(String officeName) {
        this.setOfficeName(officeName);
        return this;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeNameKana() {
        return officeNameKana;
    }

    public Addresses withOfficeNameKana(String officeNameKana) {
        this.setOfficeNameKana(officeNameKana);
        return this;
    }

    public void setOfficeNameKana(String officeNameKana) {
        this.officeNameKana = officeNameKana;
    }

    public String getOfficeOfficeAddress() {
        return officeOfficeAddress;
    }

    public Addresses withOfficeOfficeAddress(String officeOfficeAddress) {
        this.setOfficeOfficeAddress(officeOfficeAddress);
        return this;
    }

    public void setOfficeOfficeAddress(String officeOfficeAddress) {
        this.officeOfficeAddress = officeOfficeAddress;
    }

    public Integer getNewAdAddressId() {
        return newAdAddressId;
    }

    public Addresses withNewAdAddressId(Integer newAdAddressId) {
        this.setNewAdAddressId(newAdAddressId);
        return this;
    }

    public void setNewAdAddressId(Integer newAdAddressId) {
        this.newAdAddressId = newAdAddressId;
    }
}