package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord
 */
public class BQFunctionalRequirementsRequestInputModelProductorServiceSpecificationInstanceRecord   {
  private String productServiceType = null;

  private String productServiceSpecificationUsage = null;

  private String productServiceSpecificationImpact = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracking deployment and product or service usage frequency  
   * @return productServiceSpecificationUsage
  **/

  public String getProductServiceSpecificationUsage() {
    return productServiceSpecificationUsage;
  }

  public void setProductServiceSpecificationUsage(String productServiceSpecificationUsage) {
    this.productServiceSpecificationUsage = productServiceSpecificationUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Track reporting of the performance/profitability (of specific features ) of the product or service specification 
   * @return productServiceSpecificationImpact
  **/

  public String getProductServiceSpecificationImpact() {
    return productServiceSpecificationImpact;
  }

  public void setProductServiceSpecificationImpact(String productServiceSpecificationImpact) {
    this.productServiceSpecificationImpact = productServiceSpecificationImpact;
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

