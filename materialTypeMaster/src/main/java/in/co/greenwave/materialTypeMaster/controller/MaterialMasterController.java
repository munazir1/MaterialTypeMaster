package in.co.greenwave.materialTypeMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.service.MaterialMasterService;



@RestController
@RequestMapping("/materialMaster")

public class MaterialMasterController {
	
	
	@Autowired(required=true)
	private MaterialMasterService  ser;
	
	@GetMapping("/get")
	public List<MaterialMaster> getData() {
		List<MaterialMaster> getdata = ser.getdata();
		System.out.println("_-----"+getdata);
		return getdata;
	}
	
	
	@GetMapping("/data")
	public 	List<Object> getdata() {
		 List<Object> masteData = ser.getMasteData();
		return masteData;
	}
	
	@PostMapping("/save/master")
	public ResponseEntity<?>  saveMaterialMaster(@RequestBody MaterialMaster  master ) {
		System.out.println(master.getInternalMaterialCode());
		ResponseEntity<?> saveMaterialMaster = ser.saveMaterialMaster(master);
		//ser.saveMaterialMaster(master);
		return saveMaterialMaster;
	}
	

}
