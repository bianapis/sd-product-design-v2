package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis;
import org.bian.dto.CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveOutputModel
 */
public class CRProductorServiceSpecificationRetrieveOutputModel   {
  private CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationRetrieveActionTaskReference = null;

  private Object productorServiceSpecificationRetrieveActionTaskRecord = null;

  private String productorServiceSpecificationRetrieveActionResponse = null;

  private CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord productorServiceSpecificationInstanceReportRecord = null;

  private CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis productorServiceSpecificationInstanceAnalysis = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product or Service Specification instance retrieve service call 
   * @return productorServiceSpecificationRetrieveActionTaskReference
  **/

  public String getProductorServiceSpecificationRetrieveActionTaskReference() {
    return productorServiceSpecificationRetrieveActionTaskReference;
  }

  public void setProductorServiceSpecificationRetrieveActionTaskReference(String productorServiceSpecificationRetrieveActionTaskReference) {
    this.productorServiceSpecificationRetrieveActionTaskReference = productorServiceSpecificationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productorServiceSpecificationRetrieveActionResponse
  **/

  public String getProductorServiceSpecificationRetrieveActionResponse() {
    return productorServiceSpecificationRetrieveActionResponse;
  }

  public void setProductorServiceSpecificationRetrieveActionResponse(String productorServiceSpecificationRetrieveActionResponse) {
    this.productorServiceSpecificationRetrieveActionResponse = productorServiceSpecificationRetrieveActionResponse;
  }


  /**
   * Get productorServiceSpecificationInstanceReportRecord
   * @return productorServiceSpecificationInstanceReportRecord
  **/

  public CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord getProductorServiceSpecificationInstanceReportRecord() {
    return productorServiceSpecificationInstanceReportRecord;
  }

  public void setProductorServiceSpecificationInstanceReportRecord(CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceReportRecord productorServiceSpecificationInstanceReportRecord) {
    this.productorServiceSpecificationInstanceReportRecord = productorServiceSpecificationInstanceReportRecord;
  }


  /**
   * Get productorServiceSpecificationInstanceAnalysis
   * @return productorServiceSpecificationInstanceAnalysis
  **/

  public CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis getProductorServiceSpecificationInstanceAnalysis() {
    return productorServiceSpecificationInstanceAnalysis;
  }

  public void setProductorServiceSpecificationInstanceAnalysis(CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis productorServiceSpecificationInstanceAnalysis) {
    this.productorServiceSpecificationInstanceAnalysis = productorServiceSpecificationInstanceAnalysis;
  }


}

