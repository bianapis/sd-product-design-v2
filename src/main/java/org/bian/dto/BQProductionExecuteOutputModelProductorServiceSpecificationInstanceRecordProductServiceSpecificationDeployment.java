package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment
 */
public class BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment   {
  private BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration = null;


  /**
   * Get productServiceSpecificationDeploymentConfiguration
   * @return productServiceSpecificationDeploymentConfiguration
  **/

  public BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration getProductServiceSpecificationDeploymentConfiguration() {
    return productServiceSpecificationDeploymentConfiguration;
  }

  public void setProductServiceSpecificationDeploymentConfiguration(BQProductionExecuteOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration) {
    this.productServiceSpecificationDeploymentConfiguration = productServiceSpecificationDeploymentConfiguration;
  }


}

