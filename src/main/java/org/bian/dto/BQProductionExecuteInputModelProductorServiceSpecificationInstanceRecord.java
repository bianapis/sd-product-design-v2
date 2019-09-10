package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord
 */
public class BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord   {
  private BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment = null;

  private String productServiceSpecificationVersion = null;


  /**
   * Get productServiceSpecificationDeployment
   * @return productServiceSpecificationDeployment
  **/

  public BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment getProductServiceSpecificationDeployment() {
    return productServiceSpecificationDeployment;
  }

  public void setProductServiceSpecificationDeployment(BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment) {
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

