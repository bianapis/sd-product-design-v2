package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelProductionInstanceRecord
 */
public class BQProductionExecuteOutputModelProductionInstanceRecord   {
  private String productServiceSpecificationOperationalRequirements = null;

  private String productServiceSpecificationAllowedUsage = null;

  private String productServiceSpecificationUsageGuidelines = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specification of the operational and technical requirements  
   * @return productServiceSpecificationOperationalRequirements
  **/

  public String getProductServiceSpecificationOperationalRequirements() {
    return productServiceSpecificationOperationalRequirements;
  }

  public void setProductServiceSpecificationOperationalRequirements(String productServiceSpecificationOperationalRequirements) {
    this.productServiceSpecificationOperationalRequirements = productServiceSpecificationOperationalRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines rules and suitability for the product or service usage 
   * @return productServiceSpecificationAllowedUsage
  **/

  public String getProductServiceSpecificationAllowedUsage() {
    return productServiceSpecificationAllowedUsage;
  }

  public void setProductServiceSpecificationAllowedUsage(String productServiceSpecificationAllowedUsage) {
    this.productServiceSpecificationAllowedUsage = productServiceSpecificationAllowedUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provides guidance on the use of the product or service 
   * @return productServiceSpecificationUsageGuidelines
  **/

  public String getProductServiceSpecificationUsageGuidelines() {
    return productServiceSpecificationUsageGuidelines;
  }

  public void setProductServiceSpecificationUsageGuidelines(String productServiceSpecificationUsageGuidelines) {
    this.productServiceSpecificationUsageGuidelines = productServiceSpecificationUsageGuidelines;
  }


}

