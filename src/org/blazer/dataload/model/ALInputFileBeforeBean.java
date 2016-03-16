package org.blazer.dataload.model;

import java.util.List;

public class ALInputFileBeforeBean {

	private Integer recordId;

	private Integer fileId;

	private ALInputFileBean inputFileBean;

	private ALDataSourceBean dataSourceBean;

	private String beforeSql;

	private Integer sort;

	private Integer enable;

	private List<String> extInputSQLList;

	public List<String> getExtInputSQLList() {
		return extInputSQLList;
	}

	public void setExtInputSQLList(List<String> extInputSQLList) {
		this.extInputSQLList = extInputSQLList;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public ALInputFileBean getInputFileBean() {
		return inputFileBean;
	}

	public void setInputFileBean(ALInputFileBean inputFileBean) {
		this.inputFileBean = inputFileBean;
	}

	public ALDataSourceBean getDataSourceBean() {
		return dataSourceBean;
	}

	public void setDataSourceBean(ALDataSourceBean dataSourceBean) {
		this.dataSourceBean = dataSourceBean;
	}

	public String getBeforeSql() {
		return beforeSql;
	}

	public void setBeforeSql(String beforeSql) {
		this.beforeSql = beforeSql;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "ALInputFileBeforeBean [recordId=" + recordId + ", fileId=" + fileId + ", beforeSql=" + beforeSql + ", sort=" + sort + ", enable="
				+ enable + "]";
	}

}
