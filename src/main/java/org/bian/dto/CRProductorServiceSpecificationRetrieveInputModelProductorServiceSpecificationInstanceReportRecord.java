package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord
 */
public class CRProductorServiceSpecificationRetrieveInputModelProductorServiceSpecificationInstanceReportRecord   {
  private String productorServiceSpecificationInstanceReportReference = null;

  private String productorServiceSpecificationInstanceReportType = null;

  private String productorServiceSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productorServiceSpecificationInstanceReportReference
  **/

  public String getProductorServiceSpecificationInstanceReportReference() {
    return productorServiceSpecificationInstanceReportReference;
  }

  public void setProductorServiceSpecificationInstanceReportReference(String productorServiceSpecificationInstanceReportReference) {
    this.productorServiceSpecificationInstanceReportReference = productorServiceSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productorServiceSpecificationInstanceReportType
  **/

  public String getProductorServiceSpecificationInstanceReportType() {
    return productorServiceSpecificationInstanceReportType;
  }

  public void setProductorServiceSpecificationInstanceReportType(String productorServiceSpecificationInstanceReportType) {
    this.productorServiceSpecificationInstanceReportType = productorServiceSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productorServiceSpecificationInstanceReportParameters
  **/

  public String getProductorServiceSpecificationInstanceReportParameters() {
    return productorServiceSpecificationInstanceReportParameters;
  }

  public void setProductorServiceSpecificationInstanceReportParameters(String productorServiceSpecificationInstanceReportParameters) {
    this.productorServiceSpecificationInstanceReportParameters = productorServiceSpecificationInstanceReportParameters;
  }


}

