package in.co.greenwave.materialTypeMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.service.MaterialTypeMasterService;



@RestController
@RequestMapping("/material")
@CrossOrigin(origins="*")
public class MaterialTypeMasterController {

	
	@Autowired
	private MaterialTypeMasterService service;
	
	
	@GetMapping("/test")
	public 	List<MaterialTypeMaster> getdata() {
		List<MaterialTypeMaster> materialTypeMaster2 = service.getMaterialTypeMaster();
		return materialTypeMaster2;
	}
	
	
	
}
