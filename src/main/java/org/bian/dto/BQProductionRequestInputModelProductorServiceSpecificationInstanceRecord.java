package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord
 */
public class BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord   {
  private BQProductionRequestInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment = null;

  private String productServiceSpecificationVersion = null;


  /**
   * Get productServiceSpecificationDeployment
   * @return productServiceSpecificationDeployment
  **/

  public BQProductionRequestInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment getProductServiceSpecificationDeployment() {
    return productServiceSpecificationDeployment;
  }

  public void setProductServiceSpecificationDeployment(BQProductionRequestInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment) {
    this.productServiceSpecificationDeployment = productServiceSpecificationDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of the available specification plus version history as appropriate 
   * @return productServiceSpecificationVersion
  **/

  public String getProductServiceSpecificationVersion() {
    return productServiceSpecificationVersion;
  }

  public void setProductServiceSpecificationVersion(String productServiceSpecificationVersion) {
    this.productServiceSpecificationVersion = productServiceSpecificationVersion;
  }


}

