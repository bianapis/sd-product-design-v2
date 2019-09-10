package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationCreateInputModel
 */
public class CRProductorServiceSpecificationCreateInputModel   {
  private String productDesignServicingSessionReference = null;

  private Object productorServiceSpecificationCreateActionRecord = null;

  private String productorServiceSpecificationInstanceStatus = null;

  private CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productDesignServicingSessionReference
  **/

  public String getProductDesignServicingSessionReference() {
    return productDesignServicingSessionReference;
  }

  public void setProductDesignServicingSessionReference(String productDesignServicingSessionReference) {
    this.productDesignServicingSessionReference = productDesignServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return productorServiceSpecificationCreateActionRecord
  **/

  public Object getProductorServiceSpecificationCreateActionRecord() {
    return productorServiceSpecificationCreateActionRecord;
  }

  public void setProductorServiceSpecificationCreateActionRecord(Object productorServiceSpecificationCreateActionRecord) {
    this.productorServiceSpecificationCreateActionRecord = productorServiceSpecificationCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product or Service Specification instance (e.g. initialised, pending, active) 
   * @return productorServiceSpecificationInstanceStatus
  **/

  public String getProductorServiceSpecificationInstanceStatus() {
    return productorServiceSpecificationInstanceStatus;
  }

  public void setProductorServiceSpecificationInstanceStatus(String productorServiceSpecificationInstanceStatus) {
    this.productorServiceSpecificationInstanceStatus = productorServiceSpecificationInstanceStatus;
  }


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationCreateInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


}

