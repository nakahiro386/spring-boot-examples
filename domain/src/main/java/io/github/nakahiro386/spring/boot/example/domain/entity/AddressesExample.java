package io.github.nakahiro386.spring.boot.example.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressesExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdIsNull() {
            addCriterion("AD_ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdIsNotNull() {
            addCriterion("AD_ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdEqualTo(Integer value) {
            addCriterion("AD_ADDRESS_ID =", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdNotEqualTo(Integer value) {
            addCriterion("AD_ADDRESS_ID <>", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdGreaterThan(Integer value) {
            addCriterion("AD_ADDRESS_ID >", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_ADDRESS_ID >=", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdLessThan(Integer value) {
            addCriterion("AD_ADDRESS_ID <", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("AD_ADDRESS_ID <=", value, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdIn(List<Integer> values) {
            addCriterion("AD_ADDRESS_ID in", values, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdNotIn(List<Integer> values) {
            addCriterion("AD_ADDRESS_ID not in", values, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("AD_ADDRESS_ID between", value1, value2, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andAdAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_ADDRESS_ID not between", value1, value2, "adAddressId");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeIsNull() {
            addCriterion("PREFECTURE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeIsNotNull() {
            addCriterion("PREFECTURE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeEqualTo(String value) {
            addCriterion("PREFECTURE_CODE =", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeNotEqualTo(String value) {
            addCriterion("PREFECTURE_CODE <>", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeGreaterThan(String value) {
            addCriterion("PREFECTURE_CODE >", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_CODE >=", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeLessThan(String value) {
            addCriterion("PREFECTURE_CODE <", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeLessThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_CODE <=", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeLike(String value) {
            addCriterion("PREFECTURE_CODE like", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeNotLike(String value) {
            addCriterion("PREFECTURE_CODE not like", value, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeIn(List<String> values) {
            addCriterion("PREFECTURE_CODE in", values, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeNotIn(List<String> values) {
            addCriterion("PREFECTURE_CODE not in", values, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeBetween(String value1, String value2) {
            addCriterion("PREFECTURE_CODE between", value1, value2, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andPrefectureCodeNotBetween(String value1, String value2) {
            addCriterion("PREFECTURE_CODE not between", value1, value2, "prefectureCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgIsNull() {
            addCriterion("OFFICE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgIsNotNull() {
            addCriterion("OFFICE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgEqualTo(String value) {
            addCriterion("OFFICE_FLG =", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgNotEqualTo(String value) {
            addCriterion("OFFICE_FLG <>", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgGreaterThan(String value) {
            addCriterion("OFFICE_FLG >", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_FLG >=", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgLessThan(String value) {
            addCriterion("OFFICE_FLG <", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_FLG <=", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgLike(String value) {
            addCriterion("OFFICE_FLG like", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgNotLike(String value) {
            addCriterion("OFFICE_FLG not like", value, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgIn(List<String> values) {
            addCriterion("OFFICE_FLG in", values, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgNotIn(List<String> values) {
            addCriterion("OFFICE_FLG not in", values, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgBetween(String value1, String value2) {
            addCriterion("OFFICE_FLG between", value1, value2, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andOfficeFlgNotBetween(String value1, String value2) {
            addCriterion("OFFICE_FLG not between", value1, value2, "officeFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(String value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(String value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(String value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(String value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLike(String value) {
            addCriterion("DELETE_FLG like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotLike(String value) {
            addCriterion("DELETE_FLG not like", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<String> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<String> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(String value1, String value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameIsNull() {
            addCriterion("PREFECTURE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameIsNotNull() {
            addCriterion("PREFECTURE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameEqualTo(String value) {
            addCriterion("PREFECTURE_NAME =", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameNotEqualTo(String value) {
            addCriterion("PREFECTURE_NAME <>", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameGreaterThan(String value) {
            addCriterion("PREFECTURE_NAME >", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameGreaterThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_NAME >=", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameLessThan(String value) {
            addCriterion("PREFECTURE_NAME <", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameLessThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_NAME <=", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameLike(String value) {
            addCriterion("PREFECTURE_NAME like", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameNotLike(String value) {
            addCriterion("PREFECTURE_NAME not like", value, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameIn(List<String> values) {
            addCriterion("PREFECTURE_NAME in", values, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameNotIn(List<String> values) {
            addCriterion("PREFECTURE_NAME not in", values, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameBetween(String value1, String value2) {
            addCriterion("PREFECTURE_NAME between", value1, value2, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameNotBetween(String value1, String value2) {
            addCriterion("PREFECTURE_NAME not between", value1, value2, "prefectureName");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaIsNull() {
            addCriterion("PREFECTURE_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaIsNotNull() {
            addCriterion("PREFECTURE_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaEqualTo(String value) {
            addCriterion("PREFECTURE_NAME_KANA =", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaNotEqualTo(String value) {
            addCriterion("PREFECTURE_NAME_KANA <>", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaGreaterThan(String value) {
            addCriterion("PREFECTURE_NAME_KANA >", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_NAME_KANA >=", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaLessThan(String value) {
            addCriterion("PREFECTURE_NAME_KANA <", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaLessThanOrEqualTo(String value) {
            addCriterion("PREFECTURE_NAME_KANA <=", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaLike(String value) {
            addCriterion("PREFECTURE_NAME_KANA like", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaNotLike(String value) {
            addCriterion("PREFECTURE_NAME_KANA not like", value, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaIn(List<String> values) {
            addCriterion("PREFECTURE_NAME_KANA in", values, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaNotIn(List<String> values) {
            addCriterion("PREFECTURE_NAME_KANA not in", values, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaBetween(String value1, String value2) {
            addCriterion("PREFECTURE_NAME_KANA between", value1, value2, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andPrefectureNameKanaNotBetween(String value1, String value2) {
            addCriterion("PREFECTURE_NAME_KANA not between", value1, value2, "prefectureNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaIsNull() {
            addCriterion("CITY_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaIsNotNull() {
            addCriterion("CITY_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaEqualTo(String value) {
            addCriterion("CITY_NAME_KANA =", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaNotEqualTo(String value) {
            addCriterion("CITY_NAME_KANA <>", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaGreaterThan(String value) {
            addCriterion("CITY_NAME_KANA >", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME_KANA >=", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaLessThan(String value) {
            addCriterion("CITY_NAME_KANA <", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME_KANA <=", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaLike(String value) {
            addCriterion("CITY_NAME_KANA like", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaNotLike(String value) {
            addCriterion("CITY_NAME_KANA not like", value, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaIn(List<String> values) {
            addCriterion("CITY_NAME_KANA in", values, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaNotIn(List<String> values) {
            addCriterion("CITY_NAME_KANA not in", values, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaBetween(String value1, String value2) {
            addCriterion("CITY_NAME_KANA between", value1, value2, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andCityNameKanaNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME_KANA not between", value1, value2, "cityNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameIsNull() {
            addCriterion("TOWN_AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameIsNotNull() {
            addCriterion("TOWN_AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME =", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameNotEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME <>", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameGreaterThan(String value) {
            addCriterion("TOWN_AREA_NAME >", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME >=", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameLessThan(String value) {
            addCriterion("TOWN_AREA_NAME <", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameLessThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME <=", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameLike(String value) {
            addCriterion("TOWN_AREA_NAME like", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameNotLike(String value) {
            addCriterion("TOWN_AREA_NAME not like", value, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameIn(List<String> values) {
            addCriterion("TOWN_AREA_NAME in", values, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameNotIn(List<String> values) {
            addCriterion("TOWN_AREA_NAME not in", values, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_NAME between", value1, value2, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameNotBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_NAME not between", value1, value2, "townAreaName");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaIsNull() {
            addCriterion("TOWN_AREA_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaIsNotNull() {
            addCriterion("TOWN_AREA_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME_KANA =", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaNotEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME_KANA <>", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaGreaterThan(String value) {
            addCriterion("TOWN_AREA_NAME_KANA >", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME_KANA >=", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaLessThan(String value) {
            addCriterion("TOWN_AREA_NAME_KANA <", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaLessThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_NAME_KANA <=", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaLike(String value) {
            addCriterion("TOWN_AREA_NAME_KANA like", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaNotLike(String value) {
            addCriterion("TOWN_AREA_NAME_KANA not like", value, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaIn(List<String> values) {
            addCriterion("TOWN_AREA_NAME_KANA in", values, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaNotIn(List<String> values) {
            addCriterion("TOWN_AREA_NAME_KANA not in", values, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_NAME_KANA between", value1, value2, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaNameKanaNotBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_NAME_KANA not between", value1, value2, "townAreaNameKana");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoIsNull() {
            addCriterion("TOWN_AREA_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoIsNotNull() {
            addCriterion("TOWN_AREA_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoEqualTo(String value) {
            addCriterion("TOWN_AREA_MEMO =", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoNotEqualTo(String value) {
            addCriterion("TOWN_AREA_MEMO <>", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoGreaterThan(String value) {
            addCriterion("TOWN_AREA_MEMO >", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoGreaterThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_MEMO >=", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoLessThan(String value) {
            addCriterion("TOWN_AREA_MEMO <", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoLessThanOrEqualTo(String value) {
            addCriterion("TOWN_AREA_MEMO <=", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoLike(String value) {
            addCriterion("TOWN_AREA_MEMO like", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoNotLike(String value) {
            addCriterion("TOWN_AREA_MEMO not like", value, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoIn(List<String> values) {
            addCriterion("TOWN_AREA_MEMO in", values, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoNotIn(List<String> values) {
            addCriterion("TOWN_AREA_MEMO not in", values, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_MEMO between", value1, value2, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andTownAreaMemoNotBetween(String value1, String value2) {
            addCriterion("TOWN_AREA_MEMO not between", value1, value2, "townAreaMemo");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameIsNull() {
            addCriterion("CITY_BLOCK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameIsNotNull() {
            addCriterion("CITY_BLOCK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME =", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameNotEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME <>", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameGreaterThan(String value) {
            addCriterion("CITY_BLOCK_NAME >", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME >=", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameLessThan(String value) {
            addCriterion("CITY_BLOCK_NAME <", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME <=", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameLike(String value) {
            addCriterion("CITY_BLOCK_NAME like", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameNotLike(String value) {
            addCriterion("CITY_BLOCK_NAME not like", value, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameIn(List<String> values) {
            addCriterion("CITY_BLOCK_NAME in", values, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameNotIn(List<String> values) {
            addCriterion("CITY_BLOCK_NAME not in", values, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameBetween(String value1, String value2) {
            addCriterion("CITY_BLOCK_NAME between", value1, value2, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameNotBetween(String value1, String value2) {
            addCriterion("CITY_BLOCK_NAME not between", value1, value2, "cityBlockName");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaIsNull() {
            addCriterion("CITY_BLOCK_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaIsNotNull() {
            addCriterion("CITY_BLOCK_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA =", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaNotEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA <>", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaGreaterThan(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA >", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA >=", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaLessThan(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA <", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaLessThanOrEqualTo(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA <=", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaLike(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA like", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaNotLike(String value) {
            addCriterion("CITY_BLOCK_NAME_KANA not like", value, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaIn(List<String> values) {
            addCriterion("CITY_BLOCK_NAME_KANA in", values, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaNotIn(List<String> values) {
            addCriterion("CITY_BLOCK_NAME_KANA not in", values, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaBetween(String value1, String value2) {
            addCriterion("CITY_BLOCK_NAME_KANA between", value1, value2, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andCityBlockNameKanaNotBetween(String value1, String value2) {
            addCriterion("CITY_BLOCK_NAME_KANA not between", value1, value2, "cityBlockNameKana");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNull() {
            addCriterion("OFFICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIsNotNull() {
            addCriterion("OFFICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameEqualTo(String value) {
            addCriterion("OFFICE_NAME =", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotEqualTo(String value) {
            addCriterion("OFFICE_NAME <>", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThan(String value) {
            addCriterion("OFFICE_NAME >", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_NAME >=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThan(String value) {
            addCriterion("OFFICE_NAME <", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_NAME <=", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameLike(String value) {
            addCriterion("OFFICE_NAME like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotLike(String value) {
            addCriterion("OFFICE_NAME not like", value, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameIn(List<String> values) {
            addCriterion("OFFICE_NAME in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotIn(List<String> values) {
            addCriterion("OFFICE_NAME not in", values, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameBetween(String value1, String value2) {
            addCriterion("OFFICE_NAME between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameNotBetween(String value1, String value2) {
            addCriterion("OFFICE_NAME not between", value1, value2, "officeName");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaIsNull() {
            addCriterion("OFFICE_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaIsNotNull() {
            addCriterion("OFFICE_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaEqualTo(String value) {
            addCriterion("OFFICE_NAME_KANA =", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaNotEqualTo(String value) {
            addCriterion("OFFICE_NAME_KANA <>", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaGreaterThan(String value) {
            addCriterion("OFFICE_NAME_KANA >", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_NAME_KANA >=", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaLessThan(String value) {
            addCriterion("OFFICE_NAME_KANA <", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_NAME_KANA <=", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaLike(String value) {
            addCriterion("OFFICE_NAME_KANA like", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaNotLike(String value) {
            addCriterion("OFFICE_NAME_KANA not like", value, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaIn(List<String> values) {
            addCriterion("OFFICE_NAME_KANA in", values, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaNotIn(List<String> values) {
            addCriterion("OFFICE_NAME_KANA not in", values, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaBetween(String value1, String value2) {
            addCriterion("OFFICE_NAME_KANA between", value1, value2, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeNameKanaNotBetween(String value1, String value2) {
            addCriterion("OFFICE_NAME_KANA not between", value1, value2, "officeNameKana");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressIsNull() {
            addCriterion("OFFICE_OFFICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressIsNotNull() {
            addCriterion("OFFICE_OFFICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressEqualTo(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS =", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressNotEqualTo(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS <>", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressGreaterThan(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS >", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS >=", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressLessThan(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS <", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS <=", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressLike(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS like", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressNotLike(String value) {
            addCriterion("OFFICE_OFFICE_ADDRESS not like", value, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressIn(List<String> values) {
            addCriterion("OFFICE_OFFICE_ADDRESS in", values, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressNotIn(List<String> values) {
            addCriterion("OFFICE_OFFICE_ADDRESS not in", values, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressBetween(String value1, String value2) {
            addCriterion("OFFICE_OFFICE_ADDRESS between", value1, value2, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeOfficeAddressNotBetween(String value1, String value2) {
            addCriterion("OFFICE_OFFICE_ADDRESS not between", value1, value2, "officeOfficeAddress");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdIsNull() {
            addCriterion("NEW_AD_ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdIsNotNull() {
            addCriterion("NEW_AD_ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdEqualTo(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID =", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdNotEqualTo(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID <>", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdGreaterThan(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID >", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID >=", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdLessThan(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID <", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_AD_ADDRESS_ID <=", value, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdIn(List<Integer> values) {
            addCriterion("NEW_AD_ADDRESS_ID in", values, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdNotIn(List<Integer> values) {
            addCriterion("NEW_AD_ADDRESS_ID not in", values, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("NEW_AD_ADDRESS_ID between", value1, value2, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andNewAdAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_AD_ADDRESS_ID not between", value1, value2, "newAdAddressId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(int value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(int value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(int value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(int value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(int value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(int value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(int value1, int value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(int value1, int value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("LAST_MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("LAST_MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_BY >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(String value) {
            addCriterion("LAST_MODIFIED_BY <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLike(String value) {
            addCriterion("LAST_MODIFIED_BY like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotLike(String value) {
            addCriterion("LAST_MODIFIED_BY not like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("LAST_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("LAST_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}