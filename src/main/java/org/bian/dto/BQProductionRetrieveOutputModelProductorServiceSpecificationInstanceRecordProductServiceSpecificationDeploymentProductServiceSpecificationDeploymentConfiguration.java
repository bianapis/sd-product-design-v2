package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration
 */
public class BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration   {
  private String productServiceSpecificationDeploymentTaskReference = null;

  private Object productServiceSpecificationDeploymentTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specification deployment task 
   * @return productServiceSpecificationDeploymentTaskReference
  **/

  public String getProductServiceSpecificationDeploymentTaskReference() {
    return productServiceSpecificationDeploymentTaskReference;
  }

  public void setProductServiceSpecificationDeploymentTaskReference(String productServiceSpecificationDeploymentTaskReference) {
    this.productServiceSpecificationDeploymentTaskReference = productServiceSpecificationDeploymentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Recorded details of a specification deployment task 
   * @return productServiceSpecificationDeploymentTaskRecord
  **/

  public Object getProductServiceSpecificationDeploymentTaskRecord() {
    return productServiceSpecificationDeploymentTaskRecord;
  }

  public void setProductServiceSpecificationDeploymentTaskRecord(Object productServiceSpecificationDeploymentTaskRecord) {
    this.productServiceSpecificationDeploymentTaskRecord = productServiceSpecificationDeploymentTaskRecord;
  }


}

