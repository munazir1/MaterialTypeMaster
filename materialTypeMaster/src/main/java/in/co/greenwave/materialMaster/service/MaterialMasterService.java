package in.co.greenwave.materialMaster.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import in.co.greenwave.materialMaster.entity.MaterialMaster;

public interface MaterialMasterService {
	
	public List<MaterialMaster>   getdata();
	
	public List<Object>  getMaterialName();
	public List<String> getSapCode(String materialName);
	public ResponseEntity<?> saveMaterialMaster(MaterialMaster master);
	public ResponseEntity<?> insertMaterialMaster(MaterialMaster materialMaster);
	public List<MaterialMaster>  getMaterialInternaLCodeAnddes(String materialName,String sapCode);
	 
	
	

}
