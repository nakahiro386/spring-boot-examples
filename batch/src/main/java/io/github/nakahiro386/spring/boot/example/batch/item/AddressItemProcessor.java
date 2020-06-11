package io.github.nakahiro386.spring.boot.example.batch.item;

import io.github.nakahiro386.spring.boot.example.batch.dto.AdAddress;
import io.github.nakahiro386.spring.boot.example.domain.entity.Addresses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class AddressItemProcessor implements ItemProcessor<AdAddress, Addresses> {

  @Override
  public Addresses process(AdAddress item) throws Exception {
    if (log.isTraceEnabled()) {
      log.trace(item.toString());
    }
    Addresses address = new Addresses().withAdAddressId(item.getId())
        .withPrefectureCode(String.format("%02d", item.getKenId()))
        .withCityCode(String.format("%05d", item.getCityId()))
        .withZipCode(item.getZip().replace("-", ""))
        .withOfficeFlg(item.getOfficeFlg().toString())
        .withDeleteFlg(item.getDeleteFlg().toString())
        .withPrefectureName(item.getKenName())
        .withPrefectureNameKana(item.getKenFuri())
        .withCityName(item.getCityName())
        .withCityNameKana(item.getCityFuri())
        .withTownAreaName(item.getTownName())
        .withTownAreaNameKana(item.getTownFuri())
        .withTownAreaMemo(item.getTownMemo())
        .withCityBlockName(item.getBlockName())
        .withCityBlockNameKana(item.getBlockFuri())
        .withMemo(item.getMemo())
        .withOfficeName(item.getOfficeName())
        .withOfficeNameKana(item.getOfficeFuri())
        .withOfficeOfficeAddress(item.getOfficeAddress())
        .withNewAdAddressId(item.getNewId());
    return address;
  }

}
