package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationExecuteOutputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationExecuteOutputModel
 */
public class CRProductorServiceSpecificationExecuteOutputModel   {
  private CRProductorServiceSpecificationExecuteOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationExecuteActionTaskReference = null;

  private Object productorServiceSpecificationExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationExecuteOutputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationExecuteOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product or Service Specification instance execute service call 
   * @return productorServiceSpecificationExecuteActionTaskReference
  **/

  public String getProductorServiceSpecificationExecuteActionTaskReference() {
    return productorServiceSpecificationExecuteActionTaskReference;
  }

  public void setProductorServiceSpecificationExecuteActionTaskReference(String productorServiceSpecificationExecuteActionTaskReference) {
    this.productorServiceSpecificationExecuteActionTaskReference = productorServiceSpecificationExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productorServiceSpecificationExecuteActionTaskRecord
  **/

  public Object getProductorServiceSpecificationExecuteActionTaskRecord() {
    return productorServiceSpecificationExecuteActionTaskRecord;
  }

  public void setProductorServiceSpecificationExecuteActionTaskRecord(Object productorServiceSpecificationExecuteActionTaskRecord) {
    this.productorServiceSpecificationExecuteActionTaskRecord = productorServiceSpecificationExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

