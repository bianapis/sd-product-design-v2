package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis;
import org.bian.dto.CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveInputModel
 */
public class CRProductorServiceSpecificationRetrieveInputModel   {
  private Object productorServiceSpecificationRetrieveActionTaskRecord = null;

  private String productorServiceSpecificationRetrieveActionRequest = null;

  private CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord productorServiceSpecificationInstanceReportRecord = null;

  private CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis productorServiceSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productorServiceSpecificationRetrieveActionTaskRecord
  **/

  public Object getProductorServiceSpecificationRetrieveActionTaskRecord() {
    return productorServiceSpecificationRetrieveActionTaskRecord;
  }

  public void setProductorServiceSpecificationRetrieveActionTaskRecord(Object productorServiceSpecificationRetrieveActionTaskRecord) {
    this.productorServiceSpecificationRetrieveActionTaskRecord = productorServiceSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productorServiceSpecificationRetrieveActionRequest
  **/

  public String getProductorServiceSpecificationRetrieveActionRequest() {
    return productorServiceSpecificationRetrieveActionRequest;
  }

  public void setProductorServiceSpecificationRetrieveActionRequest(String productorServiceSpecificationRetrieveActionRequest) {
    this.productorServiceSpecificationRetrieveActionRequest = productorServiceSpecificationRetrieveActionRequest;
  }


  /**
   * Get productorServiceSpecificationInstanceReportRecord
   * @return productorServiceSpecificationInstanceReportRecord
  **/

  public CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord getProductorServiceSpecificationInstanceReportRecord() {
    return productorServiceSpecificationInstanceReportRecord;
  }

  public void setProductorServiceSpecificationInstanceReportRecord(CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord productorServiceSpecificationInstanceReportRecord) {
    this.productorServiceSpecificationInstanceReportRecord = productorServiceSpecificationInstanceReportRecord;
  }


  /**
   * Get productorServiceSpecificationInstanceAnalysis
   * @return productorServiceSpecificationInstanceAnalysis
  **/

  public CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis getProductorServiceSpecificationInstanceAnalysis() {
    return productorServiceSpecificationInstanceAnalysis;
  }

  public void setProductorServiceSpecificationInstanceAnalysis(CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis productorServiceSpecificationInstanceAnalysis) {
    this.productorServiceSpecificationInstanceAnalysis = productorServiceSpecificationInstanceAnalysis;
  }


}

