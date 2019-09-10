package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationRequestOutputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRequestOutputModel
 */
public class CRProductorServiceSpecificationRequestOutputModel   {
  private CRProductorServiceSpecificationRequestOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationRequestActionTaskReference = null;

  private Object productorServiceSpecificationRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationRequestOutputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationRequestOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product or Service Specification instance request service call 
   * @return productorServiceSpecificationRequestActionTaskReference
  **/

  public String getProductorServiceSpecificationRequestActionTaskReference() {
    return productorServiceSpecificationRequestActionTaskReference;
  }

  public void setProductorServiceSpecificationRequestActionTaskReference(String productorServiceSpecificationRequestActionTaskReference) {
    this.productorServiceSpecificationRequestActionTaskReference = productorServiceSpecificationRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productorServiceSpecificationRequestActionTaskRecord
  **/

  public Object getProductorServiceSpecificationRequestActionTaskRecord() {
    return productorServiceSpecificationRequestActionTaskRecord;
  }

  public void setProductorServiceSpecificationRequestActionTaskRecord(Object productorServiceSpecificationRequestActionTaskRecord) {
    this.productorServiceSpecificationRequestActionTaskRecord = productorServiceSpecificationRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

