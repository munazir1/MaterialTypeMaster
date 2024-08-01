package in.co.greenwave.materialTypeMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.service.MaterialMasterService;
import in.co.greenwave.materialTypeMaster.service.MaterialTypeMasterService;



@RestController
@RequestMapping("/materialMaster")

public class MaterialMasterController {
	
	
	@Autowired(required=true)
	private MaterialMasterService  ser;
	
	@Autowired(required=true)
	private MaterialTypeMasterService  ser2;

	
	@GetMapping("/getDetails")
	public List<MaterialMaster> getData(){
		System.out.println("System.out.println(\"\"+);");
		List<MaterialMaster> getdata = ser.getdata();
		
		System.out.println("_-----"+getdata);
		return getdata;
	}
	
	
	@GetMapping("/getName")
	public 	List<Object> getdata() {
		
		 List<Object> masteData = ser.getMaterialName();
		return masteData;
	}
	
	@PostMapping("/save/materialDetails")
	public ResponseEntity<?>  saveMaterialMaster(@RequestBody MaterialMaster  master ) {
		/*
		 * System.out.println("masterId"+master.getId());
		 * System.out.println(master.getInternalMaterialCode());
		 */
		ResponseEntity<?> saveMaterialMaster = ser.saveMaterialMaster(master);
		//ser.saveMaterialMaster(master);
		return saveMaterialMaster;
	}
	
	
	  @PostMapping("/updateBySapcode")
	  public ResponseEntity<?> deleteBySapCode(@RequestBody  MaterialMaster material) {
		  ResponseEntity<?> insertMaterialMaster = ser.insertMaterialMaster(material);
		  return insertMaterialMaster;
	  }

}
