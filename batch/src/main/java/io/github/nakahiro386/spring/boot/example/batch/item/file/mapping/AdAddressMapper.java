package io.github.nakahiro386.spring.boot.example.batch.item.file.mapping;

import io.github.nakahiro386.spring.boot.example.batch.dto.AdAddress;
import io.github.nakahiro386.spring.boot.example.fw.batch.item.file.CsvRecordMapper;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class AdAddressMapper implements CsvRecordMapper<AdAddress> {
  public AdAddressMapper() {}

  @Override
  public AdAddress mapRecord(CSVRecord record) throws Exception {
    AdAddress adAddress = new AdAddress();
    adAddress.setId(createInteger(record.get(AdAddressHeaders.Id)));
    adAddress.setKenId(createInteger(record.get(AdAddressHeaders.KenId)));
    adAddress.setCityId(createInteger(record.get(AdAddressHeaders.CityId)));
    adAddress.setTownId(createInteger(record.get(AdAddressHeaders.TownId)));
    adAddress.setZip(record.get(AdAddressHeaders.Zip));
    adAddress.setOfficeFlg(createInteger(record.get(AdAddressHeaders.OfficeFlg)));
    adAddress.setDeleteFlg(createInteger(record.get(AdAddressHeaders.DeleteFlg)));
    adAddress.setKenName(record.get(AdAddressHeaders.KenName));
    adAddress.setKenFuri(record.get(AdAddressHeaders.KenFuri));
    adAddress.setCityName(record.get(AdAddressHeaders.CityName));
    adAddress.setCityFuri(record.get(AdAddressHeaders.CityFuri));
    adAddress.setTownName(record.get(AdAddressHeaders.TownName));
    adAddress.setTownFuri(record.get(AdAddressHeaders.TownFuri));
    adAddress.setTownMemo(record.get(AdAddressHeaders.TownMemo));
    adAddress.setKyotoStreet(record.get(AdAddressHeaders.KyotoStreet));
    adAddress.setBlockName(record.get(AdAddressHeaders.BlockName));
    adAddress.setBlockFuri(record.get(AdAddressHeaders.BlockFuri));
    adAddress.setMemo(record.get(AdAddressHeaders.Memo));
    adAddress.setOfficeName(record.get(AdAddressHeaders.OfficeName));
    adAddress.setOfficeFuri(record.get(AdAddressHeaders.OfficeFuri));
    adAddress.setOfficeAddress(record.get(AdAddressHeaders.OfficeAddress));
    adAddress.setNewId(createInteger(record.get(AdAddressHeaders.NewId)));
    return adAddress;
  }

  private Integer createInteger(final String str) {
    return NumberUtils.createInteger(StringUtils.defaultIfEmpty(str, null));
  }

}
