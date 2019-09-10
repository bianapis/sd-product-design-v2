package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingRetrieveOutputModelProductorServiceSpecificationInstanceRecord;
import org.bian.dto.BQTestingRetrieveOutputModelTestingInstanceAnalysis;
import org.bian.dto.BQTestingRetrieveOutputModelTestingInstanceRecord;
import org.bian.dto.BQTestingRetrieveOutputModelTestingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTestingRetrieveOutputModel
 */
public class BQTestingRetrieveOutputModel   {
  private BQTestingRetrieveOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord = null;

  private BQTestingRetrieveOutputModelTestingInstanceRecord testingInstanceRecord = null;

  private String testingRetrieveActionTaskReference = null;

  private Object testingRetrieveActionTaskRecord = null;

  private String testingRetrieveActionResponse = null;

  private BQTestingRetrieveOutputModelTestingInstanceReport testingInstanceReport = null;

  private BQTestingRetrieveOutputModelTestingInstanceAnalysis testingInstanceAnalysis = null;


  /**
   * Get productorServiceSpecificationInstanceRecord
   * @return productorServiceSpecificationInstanceRecord
  **/

  public BQTestingRetrieveOutputModelProductorServiceSpecificationInstanceRecord getProductorServiceSpecificationInstanceRecord() {
    return productorServiceSpecificationInstanceRecord;
  }

  public void setProductorServiceSpecificationInstanceRecord(BQTestingRetrieveOutputModelProductorServiceSpecificationInstanceRecord productorServiceSpecificationInstanceRecord) {
    this.productorServiceSpecificationInstanceRecord = productorServiceSpecificationInstanceRecord;
  }


  /**
   * Get testingInstanceRecord
   * @return testingInstanceRecord
  **/

  public BQTestingRetrieveOutputModelTestingInstanceRecord getTestingInstanceRecord() {
    return testingInstanceRecord;
  }

  public void setTestingInstanceRecord(BQTestingRetrieveOutputModelTestingInstanceRecord testingInstanceRecord) {
    this.testingInstanceRecord = testingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Testing instance retrieve service call 
   * @return testingRetrieveActionTaskReference
  **/

  public String getTestingRetrieveActionTaskReference() {
    return testingRetrieveActionTaskReference;
  }

  public void setTestingRetrieveActionTaskReference(String testingRetrieveActionTaskReference) {
    this.testingRetrieveActionTaskReference = testingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return testingRetrieveActionTaskRecord
  **/

  public Object getTestingRetrieveActionTaskRecord() {
    return testingRetrieveActionTaskRecord;
  }

  public void setTestingRetrieveActionTaskRecord(Object testingRetrieveActionTaskRecord) {
    this.testingRetrieveActionTaskRecord = testingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return testingRetrieveActionResponse
  **/

  public String getTestingRetrieveActionResponse() {
    return testingRetrieveActionResponse;
  }

  public void setTestingRetrieveActionResponse(String testingRetrieveActionResponse) {
    this.testingRetrieveActionResponse = testingRetrieveActionResponse;
  }


  /**
   * Get testingInstanceReport
   * @return testingInstanceReport
  **/

  public BQTestingRetrieveOutputModelTestingInstanceReport getTestingInstanceReport() {
    return testingInstanceReport;
  }

  public void setTestingInstanceReport(BQTestingRetrieveOutputModelTestingInstanceReport testingInstanceReport) {
    this.testingInstanceReport = testingInstanceReport;
  }


  /**
   * Get testingInstanceAnalysis
   * @return testingInstanceAnalysis
  **/

  public BQTestingRetrieveOutputModelTestingInstanceAnalysis getTestingInstanceAnalysis() {
    return testingInstanceAnalysis;
  }

  public void setTestingInstanceAnalysis(BQTestingRetrieveOutputModelTestingInstanceAnalysis testingInstanceAnalysis) {
    this.testingInstanceAnalysis = testingInstanceAnalysis;
  }


}

