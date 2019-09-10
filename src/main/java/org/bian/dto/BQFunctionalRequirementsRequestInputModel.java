package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.CRProductorServiceSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModel
 */
public class BQFunctionalRequirementsRequestInputModel   {
  private BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String functionalRequirementsInstanceReference = null;

  private BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private Object functionalRequirementsRequestActionTaskRecord = null;

  private CRProductorServiceSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
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

  public BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return functionalRequirementsRequestActionTaskRecord
  **/

  public Object getFunctionalRequirementsRequestActionTaskRecord() {
    return functionalRequirementsRequestActionTaskRecord;
  }

  public void setFunctionalRequirementsRequestActionTaskRecord(Object functionalRequirementsRequestActionTaskRecord) {
    this.functionalRequirementsRequestActionTaskRecord = functionalRequirementsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductorServiceSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductorServiceSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

