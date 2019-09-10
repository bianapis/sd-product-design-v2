package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationCreateOutputModel
 */
public class CRProductorServiceSpecificationCreateOutputModel   {
  private String productorServiceSpecificationInstanceReference = null;

  private String productorServiceSpecificationCreateActionReference = null;

  private Object productorServiceSpecificationCreateActionRecord = null;

  private String productorServiceSpecificationInstanceStatus = null;

  private CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product or Service Specification instance 
   * @return productorServiceSpecificationInstanceReference
  **/

  public String getProductorServiceSpecificationInstanceReference() {
    return productorServiceSpecificationInstanceReference;
  }

  public void setProductorServiceSpecificationInstanceReference(String productorServiceSpecificationInstanceReference) {
    this.productorServiceSpecificationInstanceReference = productorServiceSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return productorServiceSpecificationCreateActionReference
  **/

  public String getProductorServiceSpecificationCreateActionReference() {
    return productorServiceSpecificationCreateActionReference;
  }

  public void setProductorServiceSpecificationCreateActionReference(String productorServiceSpecificationCreateActionReference) {
    this.productorServiceSpecificationCreateActionReference = productorServiceSpecificationCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return productorServiceSpecificationCreateActionRecord
  **/

  public Object getProductorServiceSpecificationCreateActionRecord() {
    return productorServiceSpecificationCreateActionRecord;
  }

  public void setProductorServiceSpecificationCreateActionRecord(Object productorServiceSpecificationCreateActionRecord) {
    this.productorServiceSpecificationCreateActionRecord = productorServiceSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product or Service Specification instance (e.g. initialised, pending, active) 
   * @return productorServiceSpecificationInstanceStatus
  **/

  public String getProductorServiceSpecificationInstanceStatus() {
    return productorServiceSpecificationInstanceStatus;
  }

  public void setProductorServiceSpecificationInstanceStatus(String productorServiceSpecificationInstanceStatus) {
    this.productorServiceSpecificationInstanceStatus = productorServiceSpecificationInstanceStatus;
  }


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


}

