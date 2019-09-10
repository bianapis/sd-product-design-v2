package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModelTestingInstanceRecordProductServiceSpecificationTestResult
 */
public class BQTestingRetrieveOutputModelTestingInstanceRecordProductServiceSpecificationTestResult   {
  private String productServiceSpecificationTestingTaskReference = null;

  private Object productServiceSpecificationTestingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of testing activity 
   * @return productServiceSpecificationTestingTaskReference
  **/

  public String getProductServiceSpecificationTestingTaskReference() {
    return productServiceSpecificationTestingTaskReference;
  }

  public void setProductServiceSpecificationTestingTaskReference(String productServiceSpecificationTestingTaskReference) {
    this.productServiceSpecificationTestingTaskReference = productServiceSpecificationTestingTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for this testing activity 
   * @return productServiceSpecificationTestingTaskRecord
  **/

  public Object getProductServiceSpecificationTestingTaskRecord() {
    return productServiceSpecificationTestingTaskRecord;
  }

  public void setProductServiceSpecificationTestingTaskRecord(Object productServiceSpecificationTestingTaskRecord) {
    this.productServiceSpecificationTestingTaskRecord = productServiceSpecificationTestingTaskRecord;
  }


}

