/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductDesignApiServiceImpl implements ProductDesignApiService {

	public SDProductDesignActivateOutputModel activate(SDProductDesignActivateInputModel request){
		return JsonReader.read("activate-SDProductDesignActivateOutputModel.json",new TypeReference<SDProductDesignActivateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsCaptureOutputModel captureFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsCaptureInputModel request){
		return JsonReader.read("capture-BQFunctionalRequirementsCaptureOutputModel.json",new TypeReference<BQFunctionalRequirementsCaptureOutputModel>(){});
	}
	
	public SDProductDesignConfigureOutputModel configure(String sdReferenceId, SDProductDesignConfigureInputModel request){
		return JsonReader.read("configure-SDProductDesignConfigureOutputModel.json",new TypeReference<SDProductDesignConfigureOutputModel>(){});
	}
	
	public CRProductorServiceSpecificationCreateOutputModel create(String sdReferenceId, CRProductorServiceSpecificationCreateInputModel request){
		return JsonReader.read("create-CRProductorServiceSpecificationCreateOutputModel.json",new TypeReference<CRProductorServiceSpecificationCreateOutputModel>(){});
	}
	
	public BQFunctionalRequirementsExchangeOutputModel exchangeFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsExchangeInputModel request){
		return JsonReader.read("exchange-BQFunctionalRequirementsExchangeOutputModel.json",new TypeReference<BQFunctionalRequirementsExchangeOutputModel>(){});
	}
	
	public BQTestingExchangeOutputModel exchangeTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingExchangeInputModel request){
		return JsonReader.read("exchange-BQTestingExchangeOutputModel.json",new TypeReference<BQTestingExchangeOutputModel>(){});
	}
	
	public BQProductionExecuteOutputModel executeProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionExecuteInputModel request){
		return JsonReader.read("execute-BQProductionExecuteOutputModel.json",new TypeReference<BQProductionExecuteOutputModel>(){});
	}
	
	public CRProductorServiceSpecificationExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductorServiceSpecificationExecuteInputModel request){
		return JsonReader.read("execute-CRProductorServiceSpecificationExecuteOutputModel.json",new TypeReference<CRProductorServiceSpecificationExecuteOutputModel>(){});
	}
	
	public SDProductDesignFeedbackOutputModel feedback(String sdReferenceId, SDProductDesignFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductDesignFeedbackOutputModel.json",new TypeReference<SDProductDesignFeedbackOutputModel>(){});
	}
	
	public BQFunctionalRequirementsRequestOutputModel requestFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsRequestInputModel request){
		return JsonReader.read("request-BQFunctionalRequirementsRequestOutputModel.json",new TypeReference<BQFunctionalRequirementsRequestOutputModel>(){});
	}
	
	public BQProductionRequestOutputModel requestProduction(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionRequestInputModel request){
		return JsonReader.read("request-BQProductionRequestOutputModel.json",new TypeReference<BQProductionRequestOutputModel>(){});
	}
	
	public CRProductorServiceSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductorServiceSpecificationRequestInputModel request){
		return JsonReader.read("request-CRProductorServiceSpecificationRequestOutputModel.json",new TypeReference<CRProductorServiceSpecificationRequestOutputModel>(){});
	}
	
	public CRProductorServiceSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductorServiceSpecificationRetrieveOutputModel.json",new TypeReference<CRProductorServiceSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQFunctionalRequirementsRetrieveOutputModel retrieveFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalRequirementsRetrieveOutputModel.json",new TypeReference<BQFunctionalRequirementsRetrieveOutputModel>(){});
	}
	
	public BQProductionRetrieveOutputModel retrieveProduction(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionRetrieveOutputModel.json",new TypeReference<BQProductionRetrieveOutputModel>(){});
	}
	
	public BQTestingRetrieveOutputModel retrieveTesting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTestingRetrieveOutputModel.json",new TypeReference<BQTestingRetrieveOutputModel>(){});
	}
	
	public SDProductDesignRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductDesignRetrieveOutputModel.json",new TypeReference<SDProductDesignRetrieveOutputModel>(){});
	}
	
	public BQFunctionalRequirementsUpdateOutputModel updateFunctionalrequirements(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalRequirementsUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalRequirementsUpdateOutputModel.json",new TypeReference<BQFunctionalRequirementsUpdateOutputModel>(){});
	}
	
	public BQTestingUpdateOutputModel updateTesting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTestingUpdateInputModel request){
		return JsonReader.read("update-BQTestingUpdateOutputModel.json",new TypeReference<BQTestingUpdateOutputModel>(){});
	}
	
}
