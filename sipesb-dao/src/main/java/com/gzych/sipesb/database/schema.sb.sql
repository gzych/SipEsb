-- Table: ep_transakcja_odbioru

DROP TABLE ep_dokument;
DROP TABLE ep_dane_podmiotu;
DROP TABLE ep_dane_nadawcy;
DROP TABLE ep_skrytka_adres;
DROP TABLE ep_metadane_dokumentu;
DROP TABLE ep_transakcja_odbioru;
DROP TABLE ep_transakcja_wyslania;

CREATE TABLE ep_transakcja_odbioru
(
  trod_id numeric(10,0) NOT NULL,
  trod_data_zalozenia date,
  trod_status character varying(20),
  trod_login character varying(20),
  CONSTRAINT pk_ep_transakcja_odbioru PRIMARY KEY (trod_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_transakcja_odbioru
  OWNER TO postgres;

  -- Table: ep_transakcja_wyslania


CREATE TABLE ep_transakcja_wyslania
(
  trwy_id numeric(10,0) NOT NULL,
  trwy_data_zalozenia date,
  trwy_status character varying(20),
  trwy_login character varying(20),
  CONSTRAINT pk_ep_transakcja_wyslania PRIMARY KEY (trwy_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_transakcja_wyslania
  OWNER TO postgres;
  
  -- Table: ep_metadane_dokumentu


CREATE TABLE ep_metadane_dokumentu
(
  medo_id numeric(10,0) NOT NULL,
  medo_trwy_id numeric(10,0) REFERENCES ep_transakcja_wyslania (trwy_id),
  medo_trod_id numeric(10,0) REFERENCES ep_transakcja_odbioru (trod_id),
  medo_nazwa character varying(20),
  medo_data_nadania date,
  medo_czy_testowe boolean,
  medo_dane_dodatkowe bytea,
  CONSTRAINT pk_ep_metadane_dokumentow PRIMARY KEY (medo_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_metadane_dokumentu
  OWNER TO postgres;

  -- Table: ep_dokument


CREATE TABLE ep_dokument
(
  doku_id numeric(10,0) NOT NULL,
  doku_medo_id numeric(10,0) REFERENCES ep_metadane_dokumentu(medo_id),
  doku_nazwa_pliku character varying(20),
  doku_typ_pliku character varying(20),
  doku_zawartosc bytea,
  CONSTRAINT pk_doku_dokument PRIMARY KEY (doku_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_dokument
  OWNER TO postgres;

-- Table: ep_dane_podmiotu


CREATE TABLE ep_dane_podmiotu
(
  dapo_id numeric(10,0) NOT NULL,
  dapo_medo_id numeric(10,0) REFERENCES ep_metadane_dokumentu(medo_id),
  dapo_identyfikator character varying(50),
  dapo_typ_osoby character varying(20),
  dapo_imie_skrot character varying(20),
  dapo_nazwisko_nazwa character varying(20),
  dapo_nip character varying(15),
  dapo_pesel character varying(15),
  dapo_regon character varying(15),
  dapo_zgoda boolean,
  CONSTRAINT pk_ep_dane_podmiotu PRIMARY KEY (dapo_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_dane_podmiotu
  OWNER TO postgres;

  -- Table: ep_dane_nadawcy


CREATE TABLE ep_dane_nadawcy
(
  dana_id numeric(10,0) NOT NULL,
  dana_medo_id numeric(10,0) REFERENCES ep_metadane_dokumentu(medo_id),
  dana_uzytkownik character varying(20),
  dana_system character varying(20),
  CONSTRAINT pk_ep_dane_nadawcy PRIMARY KEY (dana_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_dane_nadawcy
  OWNER TO postgres;

  -- Table: ep_skrytka_adres


CREATE TABLE ep_skrytka_adres
(
  skad_id numeric(10,0) NOT NULL,
  skad_medo_id numeric(10,0) REFERENCES ep_metadane_dokumentu(medo_id),
  skad_typ character varying(20),
  skad_nazwa_skrytki character varying(20),
  skad_adres_skrytki character varying(30),
  CONSTRAINT pk_ep_skrytka_adres PRIMARY KEY (skad_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE ep_skrytka_adres
  OWNER TO postgres;
