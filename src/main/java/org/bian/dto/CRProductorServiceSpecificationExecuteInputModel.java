package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductorServiceSpecificationExecuteInputModelExecuteRecordType;
import org.bian.dto.CRProductorServiceSpecificationExecuteInputModelProductorServiceSpecificationInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationExecuteInputModel
 */
public class CRProductorServiceSpecificationExecuteInputModel   {
  private String productDesignServicingSessionReference = null;

  private String productorServiceSpecificationInstanceReference = null;

  private CRProductorServiceSpecificationExecuteInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private Object productorServiceSpecificationExecuteActionTaskRecord = null;

  private CRProductorServiceSpecificationExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product or Service Specification instance 
   * @return productorServiceSpecificationInstanceReference
  **/

  public String getProductorServiceSpecificationInstanceReference() {
    return productorServiceSpecificationInstanceReference;
  }

  public void setProductorServiceSpecificationInstanceReference(String productorServiceSpecificationInstanceReference) {
    this.productorServiceSpecificationInstanceReference = productorServiceSpecificationInstanceReference;
  }


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public CRProductorServiceSpecificationExecuteInputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(CRProductorServiceSpecificationExecuteInputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return productorServiceSpecificationExecuteActionTaskRecord
  **/

  public Object getProductorServiceSpecificationExecuteActionTaskRecord() {
    return productorServiceSpecificationExecuteActionTaskRecord;
  }

  public void setProductorServiceSpecificationExecuteActionTaskRecord(Object productorServiceSpecificationExecuteActionTaskRecord) {
    this.productorServiceSpecificationExecuteActionTaskRecord = productorServiceSpecificationExecuteActionTaskRecord;
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

