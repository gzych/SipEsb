package com.gzych.sipesb.objects.model;

// default package
// Generated 2016-05-23 09:20:19 by Hibernate Tools 3.6.0

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;

/**
 * EpTransakcjaOdbioru generated by hbm2java
 */
@SuppressWarnings("serial")
public class EpTransakcjaOdbioru implements java.io.Serializable {

	private long trodId;
	private Date trodDataZalozenia;
	private String trodStatus;
	private String trodLogin;
	private Set<EpMetadaneDokumentu> epMetadaneDokumentus;
	private String trodUUID;

	public EpTransakcjaOdbioru() {
	}

	public EpTransakcjaOdbioru(long trodId) {
		this.trodId = trodId;
	}

	public EpTransakcjaOdbioru(long trodId, Date trodDataZalozenia, String trodStatus, String trodLogin,
							   Set<EpMetadaneDokumentu> epMetadaneDokumentus, String trodUUID) {
		this.trodId = trodId;
		this.trodDataZalozenia = trodDataZalozenia;
		this.trodStatus = trodStatus;
		this.trodLogin = trodLogin;
		this.epMetadaneDokumentus = epMetadaneDokumentus;
		this.trodUUID = trodUUID;
	}

	public long getTrodId() {
		return this.trodId;
	}

	public void setTrodId(long trodId) {
		this.trodId = trodId;
	}

	public Date getTrodDataZalozenia() {
		return this.trodDataZalozenia;
	}

	public void setTrodDataZalozenia(Date trodDataZalozenia) {
		this.trodDataZalozenia = trodDataZalozenia;
	}

	public String getTrodStatus() {
		return this.trodStatus;
	}

	public void setTrodStatus(String trodStatus) {
		this.trodStatus = trodStatus;
	}

	public String getTrodLogin() {
		return this.trodLogin;
	}

	public void setTrodLogin(String trodLogin) {
		this.trodLogin = trodLogin;
	}

	public Set<EpMetadaneDokumentu> getEpMetadaneDokumentus() {
		return this.epMetadaneDokumentus;
	}

	public void setEpMetadaneDokumentus(Set<EpMetadaneDokumentu> epMetadaneDokumentus) {
		this.epMetadaneDokumentus = epMetadaneDokumentus;
	}

	public String getTrodUUID() {
		return this.trodUUID;
	}

	public void setTrodUUID(String trodUUID) {
		this.trodUUID = trodUUID;
	}

}
