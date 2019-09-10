package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord   {
  private String productServiceSpecificationDesignTaskReference = null;

  private Object productServiceSpecificationDesignTaskRecord = null;

  private Object productServiceFeedbackRecord = null;

  private String productServiceRequirementsSpecification = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of functional requirements specification activity 
   * @return productServiceSpecificationDesignTaskReference
  **/

  public String getProductServiceSpecificationDesignTaskReference() {
    return productServiceSpecificationDesignTaskReference;
  }

  public void setProductServiceSpecificationDesignTaskReference(String productServiceSpecificationDesignTaskReference) {
    this.productServiceSpecificationDesignTaskReference = productServiceSpecificationDesignTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The record of work products used for the design task 
   * @return productServiceSpecificationDesignTaskRecord
  **/

  public Object getProductServiceSpecificationDesignTaskRecord() {
    return productServiceSpecificationDesignTaskRecord;
  }

  public void setProductServiceSpecificationDesignTaskRecord(Object productServiceSpecificationDesignTaskRecord) {
    this.productServiceSpecificationDesignTaskRecord = productServiceSpecificationDesignTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: User provided and solicited feedback, suggestions for product or service refinement 
   * @return productServiceFeedbackRecord
  **/

  public Object getProductServiceFeedbackRecord() {
    return productServiceFeedbackRecord;
  }

  public void setProductServiceFeedbackRecord(Object productServiceFeedbackRecord) {
    this.productServiceFeedbackRecord = productServiceFeedbackRecord;
  }


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

