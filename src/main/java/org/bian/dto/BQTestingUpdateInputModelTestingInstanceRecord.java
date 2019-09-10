package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTestingUpdateInputModelTestingInstanceRecordProductServiceSpecificationTestResult;

import javax.validation.Valid;
  
/**
 * BQTestingUpdateInputModelTestingInstanceRecord
 */
public class BQTestingUpdateInputModelTestingInstanceRecord   {
  private String productServiceSpecificationTestReference = null;

  private String productServiceSpecificationTestType = null;

  private String productServiceSpecificationTestHarnessReference = null;

  private BQTestingUpdateInputModelTestingInstanceRecordProductServiceSpecificationTestResult productServiceSpecificationTestResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a type of product or service specification test 
   * @return productServiceSpecificationTestReference
  **/

  public String getProductServiceSpecificationTestReference() {
    return productServiceSpecificationTestReference;
  }

  public void setProductServiceSpecificationTestReference(String productServiceSpecificationTestReference) {
    this.productServiceSpecificationTestReference = productServiceSpecificationTestReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of test (e.g. user/consumer checks, profitability simulations, business acceptance etc.) 
   * @return productServiceSpecificationTestType
  **/

  public String getProductServiceSpecificationTestType() {
    return productServiceSpecificationTestType;
  }

  public void setProductServiceSpecificationTestType(String productServiceSpecificationTestType) {
    this.productServiceSpecificationTestType = productServiceSpecificationTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the testing environment used to apply the test (can include production events and transactions to simulate performance) 
   * @return productServiceSpecificationTestHarnessReference
  **/

  public String getProductServiceSpecificationTestHarnessReference() {
    return productServiceSpecificationTestHarnessReference;
  }

  public void setProductServiceSpecificationTestHarnessReference(String productServiceSpecificationTestHarnessReference) {
    this.productServiceSpecificationTestHarnessReference = productServiceSpecificationTestHarnessReference;
  }


  /**
   * Get productServiceSpecificationTestResult
   * @return productServiceSpecificationTestResult
  **/

  public BQTestingUpdateInputModelTestingInstanceRecordProductServiceSpecificationTestResult getProductServiceSpecificationTestResult() {
    return productServiceSpecificationTestResult;
  }

  public void setProductServiceSpecificationTestResult(BQTestingUpdateInputModelTestingInstanceRecordProductServiceSpecificationTestResult productServiceSpecificationTestResult) {
    this.productServiceSpecificationTestResult = productServiceSpecificationTestResult;
  }


}

