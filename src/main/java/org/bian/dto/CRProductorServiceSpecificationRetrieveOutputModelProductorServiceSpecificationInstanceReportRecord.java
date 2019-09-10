package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord
 */
public class CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord   {
  private String productorServiceSpecificationInstanceReportData = null;

  private String productorServiceSpecificationInstanceReportType = null;

  private Object productorServiceSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productorServiceSpecificationInstanceReportData
  **/

  public String getProductorServiceSpecificationInstanceReportData() {
    return productorServiceSpecificationInstanceReportData;
  }

  public void setProductorServiceSpecificationInstanceReportData(String productorServiceSpecificationInstanceReportData) {
    this.productorServiceSpecificationInstanceReportData = productorServiceSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productorServiceSpecificationInstanceReportType
  **/

  public String getProductorServiceSpecificationInstanceReportType() {
    return productorServiceSpecificationInstanceReportType;
  }

  public void setProductorServiceSpecificationInstanceReportType(String productorServiceSpecificationInstanceReportType) {
    this.productorServiceSpecificationInstanceReportType = productorServiceSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productorServiceSpecificationInstanceReport
  **/

  public Object getProductorServiceSpecificationInstanceReport() {
    return productorServiceSpecificationInstanceReport;
  }

  public void setProductorServiceSpecificationInstanceReport(Object productorServiceSpecificationInstanceReport) {
    this.productorServiceSpecificationInstanceReport = productorServiceSpecificationInstanceReport;
  }


}

