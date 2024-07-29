package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialTypeMasterRepository;

@Service
public class MaterialTypeMasterServiceImpl implements MaterialTypeMasterService {
	
	
	@Autowired
	 private MaterialTypeMasterRepository  repo;

	@Override
	public List<MaterialTypeMaster> getMaterialTypeMasterData() {
		List<MaterialTypeMaster> all = repo.findAll();
		
		
	
		return all;
	}
	 
	 
	 
	
	 
	 

}
