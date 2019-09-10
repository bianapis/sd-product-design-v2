package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment
 */
public class CRProductorServiceSpecificationCreateOutputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeployment   {
  private CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration = null;


  /**
   * Get productServiceSpecificationDeploymentConfiguration
   * @return productServiceSpecificationDeploymentConfiguration
  **/

  public CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration getProductServiceSpecificationDeploymentConfiguration() {
    return productServiceSpecificationDeploymentConfiguration;
  }

  public void setProductServiceSpecificationDeploymentConfiguration(CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecordProductServiceSpecificationDeploymentProductServiceSpecificationDeploymentConfiguration productServiceSpecificationDeploymentConfiguration) {
    this.productServiceSpecificationDeploymentConfiguration = productServiceSpecificationDeploymentConfiguration;
  }


}
