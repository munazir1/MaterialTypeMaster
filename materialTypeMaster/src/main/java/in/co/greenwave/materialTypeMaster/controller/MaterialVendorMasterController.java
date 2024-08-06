package in.co.greenwave.materialTypeMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;
import in.co.greenwave.materialTypeMaster.service.MaterialVendorMasterService;

@RestController
@RequestMapping("/materialVendor")
@CrossOrigin(origins = "*")
public class MaterialVendorMasterController {
	
	@Autowired
	private MaterialVendorMasterService materialVendorMasterService;
	
	
	@GetMapping("/details")
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
	public void  updateMaterialVendorMaster(@RequestBody MaterialVendorMaster materialVendorMaster){
		 materialVendorMasterService.updateMaterialVendorMaster(materialVendorMaster);
		//return materialVendorMaster;
	}
	
	

}
