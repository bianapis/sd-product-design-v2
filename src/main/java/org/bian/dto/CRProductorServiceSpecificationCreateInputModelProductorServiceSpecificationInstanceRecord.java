package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord
 */
public class CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord   {
  private String productServiceType = null;

  private String productServiceDescription = null;

  private CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment = null;

  private String productServiceSpecificationStatus = null;

  private String productServiceSpecificationUsage = null;

  private String productServiceSpecificationImpact = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the product or service including its main features and target customer 
   * @return productServiceDescription
  **/

  public String getProductServiceDescription() {
    return productServiceDescription;
  }

  public void setProductServiceDescription(String productServiceDescription) {
    this.productServiceDescription = productServiceDescription;
  }


  /**
   * Get productServiceSpecificationDeployment
   * @return productServiceSpecificationDeployment
  **/

  public CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment getProductServiceSpecificationDeployment() {
    return productServiceSpecificationDeployment;
  }

  public void setProductServiceSpecificationDeployment(CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment) {
    this.productServiceSpecificationDeployment = productServiceSpecificationDeployment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The operational and development status of the product or service specification (e.g. under development, available, in-use under review)  
   * @return productServiceSpecificationStatus
  **/

  public String getProductServiceSpecificationStatus() {
    return productServiceSpecificationStatus;
  }

  public void setProductServiceSpecificationStatus(String productServiceSpecificationStatus) {
    this.productServiceSpecificationStatus = productServiceSpecificationStatus;
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


}

