package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord
 */
public class BQFunctionalRequirementsCaptureInputModelFunctionalRequirementsInstanceRecord   {
  private Object productServiceFeedbackRecord = null;


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


}

