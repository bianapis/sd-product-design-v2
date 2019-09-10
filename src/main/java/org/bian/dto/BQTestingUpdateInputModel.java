package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.BQTestingUpdateInputModelTestingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModel
 */
public class BQTestingUpdateInputModel   {
  private BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String testingInstanceReference = null;

  private BQTestingUpdateInputModelTestingInstanceRecord testingInstanceRecord = null;

  private Object testingUpdateActionTaskRecord = null;

  private String testingUpdateActionRequest = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Testing instance 
   * @return testingInstanceReference
  **/

  public String getTestingInstanceReference() {
    return testingInstanceReference;
  }

  public void setTestingInstanceReference(String testingInstanceReference) {
    this.testingInstanceReference = testingInstanceReference;
  }


  /**
   * Get testingInstanceRecord
   * @return testingInstanceRecord
  **/

  public BQTestingUpdateInputModelTestingInstanceRecord getTestingInstanceRecord() {
    return testingInstanceRecord;
  }

  public void setTestingInstanceRecord(BQTestingUpdateInputModelTestingInstanceRecord testingInstanceRecord) {
    this.testingInstanceRecord = testingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return testingUpdateActionTaskRecord
  **/

  public Object getTestingUpdateActionTaskRecord() {
    return testingUpdateActionTaskRecord;
  }

  public void setTestingUpdateActionTaskRecord(Object testingUpdateActionTaskRecord) {
    this.testingUpdateActionTaskRecord = testingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return testingUpdateActionRequest
  **/

  public String getTestingUpdateActionRequest() {
    return testingUpdateActionRequest;
  }

  public void setTestingUpdateActionRequest(String testingUpdateActionRequest) {
    this.testingUpdateActionRequest = testingUpdateActionRequest;
  }


}

