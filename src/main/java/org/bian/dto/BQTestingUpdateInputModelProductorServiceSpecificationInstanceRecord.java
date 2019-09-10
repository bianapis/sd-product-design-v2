package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord
 */
public class BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecord   {
  private String productServiceType = null;

  private BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment = null;

  private String productServiceSpecificationVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of product or service (e.g. specialized consumer loan, relocation services) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * Get productServiceSpecificationDeployment
   * @return productServiceSpecificationDeployment
  **/

  public BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment getProductServiceSpecificationDeployment() {
    return productServiceSpecificationDeployment;
  }

  public void setProductServiceSpecificationDeployment(BQTestingUpdateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment) {
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

