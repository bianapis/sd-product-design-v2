package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.CRProductorServiceSpecificationExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionExecuteInputModel
 */
public class BQProductionExecuteInputModel   {
  private BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private String productorServiceSpecificationInstanceReference = null;

  private String productionInstanceReference = null;

  private Object productionExecuteActionTaskRecord = null;

  private CRProductorServiceSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQProductionExecuteInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productionExecuteActionTaskRecord
  **/

  public Object getProductionExecuteActionTaskRecord() {
    return productionExecuteActionTaskRecord;
  }

  public void setProductionExecuteActionTaskRecord(Object productionExecuteActionTaskRecord) {
    this.productionExecuteActionTaskRecord = productionExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRProductorServiceSpecificationExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRProductorServiceSpecificationExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

