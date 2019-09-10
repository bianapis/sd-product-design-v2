package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsCaptureInputModelCaptureRecordType;
import org.bian.dto.BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsCaptureInputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsCaptureInputModel
 */
public class BQFunctionalRequirementsCaptureInputModel   {
  private BQFunctionalRequirementsCaptureInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private Object functionalRequirementsCaptureActionTaskRecord = null;

  private BQFunctionalRequirementsCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsCaptureInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQFunctionalRequirementsCaptureInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
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

  public BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return functionalRequirementsCaptureActionTaskRecord
  **/

  public Object getFunctionalRequirementsCaptureActionTaskRecord() {
    return functionalRequirementsCaptureActionTaskRecord;
  }

  public void setFunctionalRequirementsCaptureActionTaskRecord(Object functionalRequirementsCaptureActionTaskRecord) {
    this.functionalRequirementsCaptureActionTaskRecord = functionalRequirementsCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQFunctionalRequirementsCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQFunctionalRequirementsCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

