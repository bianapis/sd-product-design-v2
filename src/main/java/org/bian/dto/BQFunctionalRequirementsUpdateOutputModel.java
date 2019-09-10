package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord;
import org.bian.dto.BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFunctionalRequirementsUpdateOutputModel
 */
public class BQFunctionalRequirementsUpdateOutputModel   {
  private BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord = null;

  private String functionalRequirementsUpdateActionTaskReference = null;

  private Object functionalRequirementsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQFunctionalRequirementsUpdateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * Get functionalRequirementsInstanceRecord
   * @return functionalRequirementsInstanceRecord
  **/

  public BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord getFunctionalRequirementsInstanceRecord() {
    return functionalRequirementsInstanceRecord;
  }

  public void setFunctionalRequirementsInstanceRecord(BQFunctionalRequirementsUpdateInputModelFunctionalRequirementsInstanceRecord functionalRequirementsInstanceRecord) {
    this.functionalRequirementsInstanceRecord = functionalRequirementsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return functionalRequirementsUpdateActionTaskReference
  **/

  public String getFunctionalRequirementsUpdateActionTaskReference() {
    return functionalRequirementsUpdateActionTaskReference;
  }

  public void setFunctionalRequirementsUpdateActionTaskReference(String functionalRequirementsUpdateActionTaskReference) {
    this.functionalRequirementsUpdateActionTaskReference = functionalRequirementsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return functionalRequirementsUpdateActionTaskRecord
  **/

  public Object getFunctionalRequirementsUpdateActionTaskRecord() {
    return functionalRequirementsUpdateActionTaskRecord;
  }

  public void setFunctionalRequirementsUpdateActionTaskRecord(Object functionalRequirementsUpdateActionTaskRecord) {
    this.functionalRequirementsUpdateActionTaskRecord = functionalRequirementsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

