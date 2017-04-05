package com.gzych.sipesb.objects.model;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

/**
 * EpDokument generated by hbm2java
 */
@SuppressWarnings("serial")
public class EpDokument implements java.io.Serializable {

	private long dokuId;
	private EpMetadaneDokumentu epMetadaneDokumentu;
	private String dokuNazwaPliku;
	private String dokuTypPliku;
	private byte[] dokuZawartosc;
	private String dokuUUID;

	public EpDokument() {
	}

	public EpDokument(long dokuId) {
		this.dokuId = dokuId;
	}

	public EpDokument(long dokuId, EpMetadaneDokumentu epMetadaneDokumentu, String dokuNazwaPliku, String dokuTypPliku,
			byte[] dokuZawartosc, String dokuUUID) {
		this.dokuId = dokuId;
		this.epMetadaneDokumentu = epMetadaneDokumentu;
		this.dokuNazwaPliku = dokuNazwaPliku;
		this.dokuTypPliku = dokuTypPliku;
		this.dokuZawartosc = dokuZawartosc;
		this.dokuUUID = dokuUUID;
	}

	public long getDokuId() {
		return this.dokuId;
	}

	public void setDokuId(long dokuId) {
		this.dokuId = dokuId;
	}

	public EpMetadaneDokumentu getEpMetadaneDokumentu() {
		return this.epMetadaneDokumentu;
	}

	public void setEpMetadaneDokumentu(EpMetadaneDokumentu epMetadaneDokumentu) {
		this.epMetadaneDokumentu = epMetadaneDokumentu;
	}

	public String getDokuNazwaPliku() {
		return this.dokuNazwaPliku;
	}

	public void setDokuNazwaPliku(String dokuNazwaPliku) {
		this.dokuNazwaPliku = dokuNazwaPliku;
	}

	public String getDokuTypPliku() {
		return this.dokuTypPliku;
	}

	public void setDokuTypPliku(String dokuTypPliku) {
		this.dokuTypPliku = dokuTypPliku;
	}

	public byte[] getDokuZawartosc() {
		return this.dokuZawartosc;
	}

	public void setDokuZawartosc(byte[] dokuZawartosc) {
		this.dokuZawartosc = dokuZawartosc;
	}

	public String getDokuUUID() {
		return this.dokuUUID;
	}

	public void setDokuUUID(String dokuUUID) {
		this.dokuUUID = dokuUUID;
	}
}