package in.co.greenwave.materialMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialMaster.entity.MaterialVendorMaster;
import in.co.greenwave.materialMaster.service.MaterialVendorMasterService;

@RestController
@RequestMapping("/materialVendor")
@CrossOrigin(origins = "*")
public class MaterialVendorMasterController {
	
	@Autowired
	private MaterialVendorMasterService materialVendorMasterService;
	
	
	@GetMapping("/getMaterialVendor")
	public List<MaterialVendorMaster>  getMaterialVendorMaster(){
		List<MaterialVendorMaster> materialVendorMaster = materialVendorMasterService.getMaterialVendorMaster();
		return materialVendorMaster;
	}
	
	@PostMapping("/saveMaterialVendor")
	public void  gaveMaterialVendorMaster(@RequestBody MaterialVendorMaster materialVendorMaster){
		 materialVendorMasterService.saveMaterialVendorMaster(materialVendorMaster);
		//return materialVendorMaster;
	}
	
	@PostMapping("/updateMaterialVendor")
	public ResponseEntity<?>  updateMaterialVendorMaster(@RequestBody MaterialVendorMaster materialVendorMaster){
		
		 ResponseEntity<?> updateMaterialVendorMaster = materialVendorMasterService.updateMaterialVendorMaster(materialVendorMaster);
		  return updateMaterialVendorMaster;
	}
	
	

}
