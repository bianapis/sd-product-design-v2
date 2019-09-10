package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsRetrieveOutputModelFunctionalRequirementsInstanceRecord   {
  private String productServiceSpecificationDesignTaskReference = null;

  private Object productServiceSpecificationDesignTaskRecord = null;

  private String marketResearchDataServiceReference = null;

  private Object marketResearchDataRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to external service information provider used to obtain product or service related market research as input to the design 
   * @return marketResearchDataServiceReference
  **/

  public String getMarketResearchDataServiceReference() {
    return marketResearchDataServiceReference;
  }

  public void setMarketResearchDataServiceReference(String marketResearchDataServiceReference) {
    this.marketResearchDataServiceReference = marketResearchDataServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Record of the product or service related market research 
   * @return marketResearchDataRecord
  **/

  public Object getMarketResearchDataRecord() {
    return marketResearchDataRecord;
  }

  public void setMarketResearchDataRecord(Object marketResearchDataRecord) {
    this.marketResearchDataRecord = marketResearchDataRecord;
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

