package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.CRProductorServiceSpecificationRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionRequestInputModel
 */
public class BQProductionRequestInputModel   {
  private BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String productionInstanceReference = null;

  private Object productionRequestActionTaskRecord = null;

  private CRProductorServiceSpecificationRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQProductionRequestInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product or Service Specification instance 
   * @return productorServiceSpecificationInstanceReference
  **/

  public String getProductorServiceSpecificationInstanceReference() {
    return productorServiceSpecificationInstanceReference;
  }

  public void setProductorServiceSpecificationInstanceReference(String productorServiceSpecificationInstanceReference) {
    this.productorServiceSpecificationInstanceReference = productorServiceSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production instance 
   * @return productionInstanceReference
  **/

  public String getProductionInstanceReference() {
    return productionInstanceReference;
  }

  public void setProductionInstanceReference(String productionInstanceReference) {
    this.productionInstanceReference = productionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionRequestActionTaskRecord
  **/

  public Object getProductionRequestActionTaskRecord() {
    return productionRequestActionTaskRecord;
  }

  public void setProductionRequestActionTaskRecord(Object productionRequestActionTaskRecord) {
    this.productionRequestActionTaskRecord = productionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProductorServiceSpecificationRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProductorServiceSpecificationRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

