package in.co.greenwave.materialMaster.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialMaster.entity.MaterialMaster;
import in.co.greenwave.materialMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialMaster.service.MaterialMasterService;
import in.co.greenwave.materialMaster.service.MaterialTypeMasterService;



@RestController
@RequestMapping("/materialMaster")
@CrossOrigin(origins = "*")
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
	
	@GetMapping("/getSapCode")
	public 	List<String> getSapCode(@RequestParam("materialName" ) String materialName) {
		List<String> sapCode = ser.getSapCode(materialName); 
		return  sapCode;
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


		@GetMapping("/getDescription")
		public 	 Map<String,String> getInternalMaerialCodeAndDes(@RequestParam("materialName" ) String materialName ,@RequestParam("sapCode" ) String sapCode) {
		 List<MaterialMaster> materialInternaLCodeAnddes = ser.getMaterialInternaLCodeAnddes(materialName, sapCode);
		// MaterialMaster materislMAster=new MaterialMaster();
		 Map<String,String> InternalMaterialCode = new HashMap<>();
		 for (MaterialMaster materialMaster : materialInternaLCodeAnddes) {
				  materialMaster.getDescription(); materialMaster.getInternalMaterialCode();
				  InternalMaterialCode.put("internalMaterialCode", materialMaster.getInternalMaterialCode());
				  InternalMaterialCode.put("description", materialMaster.getDescription());
		 }	
		 return  InternalMaterialCode;
		}
}
