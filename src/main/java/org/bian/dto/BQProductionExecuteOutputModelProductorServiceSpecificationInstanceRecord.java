package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecord
 */
public class BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecord   {
  private BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment = null;

  private String productServiceSpecificationStatus = null;

  private String productServiceSpecificationUsage = null;

  private String productServiceSpecificationVersion = null;

  private String productServiceSpecification = null;


  /**
   * Get productServiceSpecificationDeployment
   * @return productServiceSpecificationDeployment
  **/

  public BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment getProductServiceSpecificationDeployment() {
    return productServiceSpecificationDeployment;
  }

  public void setProductServiceSpecificationDeployment(BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment productServiceSpecificationDeployment) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Release version of the available specification plus version history as appropriate 
   * @return productServiceSpecificationVersion
  **/

  public String getProductServiceSpecificationVersion() {
    return productServiceSpecificationVersion;
  }

  public void setProductServiceSpecificationVersion(String productServiceSpecificationVersion) {
    this.productServiceSpecificationVersion = productServiceSpecificationVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The deployable product or service specification in any appropriate form (including historical versions as appropriate). Note supporting systems and production/operations facilities are handled in parallel as part of a broader deployment 
   * @return productServiceSpecification
  **/

  public String getProductServiceSpecification() {
    return productServiceSpecification;
  }

  public void setProductServiceSpecification(String productServiceSpecification) {
    this.productServiceSpecification = productServiceSpecification;
  }


}

