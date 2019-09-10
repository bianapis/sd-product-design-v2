/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductDesignApiService {

	SDProductDesignActivateOutputModel activate(SDProductDesignActivateInputModel request);
	
	BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request);
	
	SDProductDesignConfigureOutputModel configure(String sdReferenceId, SDProductDesignConfigureInputModel request);
	
	CRProductorServiceSpecificationCreateOutputModel create(String sdReferenceId, CRProductorServiceSpecificationCreateInputModel request);
	
	BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request);
	
	BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request);
	
	BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request);
	
	CRProductorServiceSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductorServiceSpecificationExecuteInputModel request);
	
	SDProductDesignFeedbackOutputModel feedback(String sdReferenceId, SDProductDesignFeedbackInputModel request);
	
	BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request);
	
	BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request);
	
	CRProductorServiceSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductorServiceSpecificationRequestInputModel request);
	
	CRProductorServiceSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDProductDesignRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request);
	
	BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request);
	
}
