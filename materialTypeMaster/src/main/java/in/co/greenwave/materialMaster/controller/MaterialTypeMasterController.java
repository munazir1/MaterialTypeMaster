package in.co.greenwave.materialMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialMaster.entity.MaterialMaster;
import in.co.greenwave.materialMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialMaster.service.MaterialTypeMasterService;



@RestController
@RequestMapping("/materialTpye")
@CrossOrigin(origins="*")
public class MaterialTypeMasterController {

	
	@Autowired
	private MaterialTypeMasterService service;
	
	
	@GetMapping("/details")
	public 	List<MaterialTypeMaster> getdata() {
		List<MaterialTypeMaster> materialTypeMaster2 = service.getMaterialTypeMasterData();
		return materialTypeMaster2;
	}
	
	
	
	
}
