package in.co.greenwave.materialTypeMaster.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.controller.MaterialTypeMasterController;
import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialTypeMasterRepository;

@Service
public class MaterialTypeMasterService implements MaterialTypeMasterServiceImlp {
	 @Autowired
	 private MaterialTypeMasterRepository  repo;

	@Override
	public List<MaterialTypeMaster> getMaterialTypeMaster() {
		List<MaterialTypeMaster> all = repo.findAll();
		
		for (MaterialTypeMaster materialTypeMaster : all) {
			
		}
	
		return all;
	}
	 
	 
	 
	
	 
	 

}
