package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsRequestInputModelFunctionalRequirementsInstanceRecord   {
  private String productServiceRequirementsSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The product or service detailed functional requirements specification (with versioning as appropriate) 
   * @return productServiceRequirementsSpecification
  **/

  public String getProductServiceRequirementsSpecification() {
    return productServiceRequirementsSpecification;
  }

  public void setProductServiceRequirementsSpecification(String productServiceRequirementsSpecification) {
    this.productServiceRequirementsSpecification = productServiceRequirementsSpecification;
  }


}

