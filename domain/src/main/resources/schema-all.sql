CREATE TABLE IF NOT EXISTS people  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    version INTEGER NOT NULL,
    created_by VARCHAR2(255) NOT NULL,
    created_date TIMESTAMP NOT NULL,
    last_modified_by VARCHAR2(255) NULL,
    last_modified_date TIMESTAMP NULL
);

CREATE TABLE IF NOT EXISTS addresses(
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    ad_address_id INTEGER NOT NULL UNIQUE,
    prefecture_code CHAR(2) NOT NULL,
    city_code CHAR(5) NOT NULL,
    zip_code CHAR(7) NOT NULL,
    office_flg CHAR(1) NOT NULL,
    delete_flg CHAR(1) NOT NULL,
    prefecture_name VARCHAR(8) NOT NULL,
    prefecture_name_kana VARCHAR(8) NOT NULL,
    city_name VARCHAR(24) NOT NULL,
    city_name_kana VARCHAR(24) NOT NULL,
    town_area_name VARCHAR(32),
    town_area_name_kana VARCHAR(32),
    town_area_memo VARCHAR(16),
    city_block_name VARCHAR(64),
    city_block_name_kana VARCHAR(64),
    memo VARCHAR(255),
    office_name VARCHAR(255),
    office_name_kana VARCHAR(255),
    office_office_address VARCHAR(255),
    new_ad_address_id INTEGER,
    version INTEGER NOT NULL,
    created_by VARCHAR2(255) NOT NULL,
    created_date TIMESTAMP NOT NULL,
    last_modified_by VARCHAR2(255) NULL,
    last_modified_date TIMESTAMP NULL
);
