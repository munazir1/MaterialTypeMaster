package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;

public interface MaterialMasterService {
	
	public List<MaterialMaster>   getdata();
	
	public List<Object>  getMaterialName();
	public ResponseEntity<?> saveMaterialMaster(MaterialMaster master);
	public ResponseEntity<?> insertMaterialMaster(MaterialMaster materialMaster);
	 
	
	

}
