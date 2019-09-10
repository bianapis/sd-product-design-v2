package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis
 */
public class CRProductorServiceSpecificationRetrieveOutputModelProductorServiceSpecificationInstanceAnalysis   {
  private String productorServiceSpecificationInstanceAnalysisData = null;

  private String productorServiceSpecificationInstanceAnalysisReportType = null;

  private Object productorServiceSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productorServiceSpecificationInstanceAnalysisData
  **/

  public String getProductorServiceSpecificationInstanceAnalysisData() {
    return productorServiceSpecificationInstanceAnalysisData;
  }

  public void setProductorServiceSpecificationInstanceAnalysisData(String productorServiceSpecificationInstanceAnalysisData) {
    this.productorServiceSpecificationInstanceAnalysisData = productorServiceSpecificationInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productorServiceSpecificationInstanceAnalysisReport
  **/

  public Object getProductorServiceSpecificationInstanceAnalysisReport() {
    return productorServiceSpecificationInstanceAnalysisReport;
  }

  public void setProductorServiceSpecificationInstanceAnalysisReport(Object productorServiceSpecificationInstanceAnalysisReport) {
    this.productorServiceSpecificationInstanceAnalysisReport = productorServiceSpecificationInstanceAnalysisReport;
  }


}

