package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsUpdateInputModel
 */
public class BQFunctionalRequirementsUpdateInputModel   {
  private BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private Object functionalRequirementsUpdateActionTaskRecord = null;

  private String functionalRequirementsUpdateActionRequest = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product or Service Specification instance 
   * @return productorServiceSpecificationInstanceReference
  **/

  public String getProductorServiceSpecificationInstanceReference() {
    return productorServiceSpecificationInstanceReference;
  }

  public void setProductorServiceSpecificationInstanceReference(String productorServiceSpecificationInstanceReference) {
    this.productorServiceSpecificationInstanceReference = productorServiceSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Functional Requirements instance 
   * @return functionalRequirementsInstanceReference
  **/

  public String getFunctionalRequirementsInstanceReference() {
    return functionalRequirementsInstanceReference;
  }

  public void setFunctionalRequirementsInstanceReference(String functionalRequirementsInstanceReference) {
    this.functionalRequirementsInstanceReference = functionalRequirementsInstanceReference;
  }


  /**
   * Get functionalRequirementsInstanceRecord
   * @return functionalRequirementsInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return functionalRequirementsUpdateActionTaskRecord
  **/

  public Object getFunctionalRequirementsUpdateActionTaskRecord() {
    return functionalRequirementsUpdateActionTaskRecord;
  }

  public void setFunctionalRequirementsUpdateActionTaskRecord(Object functionalRequirementsUpdateActionTaskRecord) {
    this.functionalRequirementsUpdateActionTaskRecord = functionalRequirementsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return functionalRequirementsUpdateActionRequest
  **/

  public String getFunctionalRequirementsUpdateActionRequest() {
    return functionalRequirementsUpdateActionRequest;
  }

  public void setFunctionalRequirementsUpdateActionRequest(String functionalRequirementsUpdateActionRequest) {
    this.functionalRequirementsUpdateActionRequest = functionalRequirementsUpdateActionRequest;
  }


}

