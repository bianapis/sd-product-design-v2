package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment
 */
public class BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment   {
  private String employeeBusinessUnitReference = null;

  private BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business units where the product or service is in use or supported 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * Get productServiceSpecificationDeploymentConfiguration
   * @return productServiceSpecificationDeploymentConfiguration
  **/

  public BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration getProductServiceSpecificationDeploymentConfiguration() {
    return productServiceSpecificationDeploymentConfiguration;
  }

  public void setProductServiceSpecificationDeploymentConfiguration(BQProductionRetrieveOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration) {
    this.productServiceSpecificationDeploymentConfiguration = productServiceSpecificationDeploymentConfiguration;
  }


}

