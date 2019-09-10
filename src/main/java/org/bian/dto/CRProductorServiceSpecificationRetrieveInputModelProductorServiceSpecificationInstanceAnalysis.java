package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis
 */
public class CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceAnalysis   {
  private String productorServiceSpecificationInstanceAnalysisReference = null;

  private String productorServiceSpecificationInstanceAnalysisReportType = null;

  private String productorServiceSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productorServiceSpecificationInstanceAnalysisReference
  **/

  public String getProductorServiceSpecificationInstanceAnalysisReference() {
    return productorServiceSpecificationInstanceAnalysisReference;
  }

  public void setProductorServiceSpecificationInstanceAnalysisReference(String productorServiceSpecificationInstanceAnalysisReference) {
    this.productorServiceSpecificationInstanceAnalysisReference = productorServiceSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productorServiceSpecificationInstanceAnalysisReportType
  **/

  public String getProductorServiceSpecificationInstanceAnalysisReportType() {
    return productorServiceSpecificationInstanceAnalysisReportType;
  }

  public void setProductorServiceSpecificationInstanceAnalysisReportType(String productorServiceSpecificationInstanceAnalysisReportType) {
    this.productorServiceSpecificationInstanceAnalysisReportType = productorServiceSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productorServiceSpecificationInstanceAnalysisParameters
  **/

  public String getProductorServiceSpecificationInstanceAnalysisParameters() {
    return productorServiceSpecificationInstanceAnalysisParameters;
  }

  public void setProductorServiceSpecificationInstanceAnalysisParameters(String productorServiceSpecificationInstanceAnalysisParameters) {
    this.productorServiceSpecificationInstanceAnalysisParameters = productorServiceSpecificationInstanceAnalysisParameters;
  }


}

