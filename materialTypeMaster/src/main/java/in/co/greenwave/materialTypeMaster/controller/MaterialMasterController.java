package in.co.greenwave.materialTypeMaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.entity.MaterialTypeMaster;
import in.co.greenwave.materialTypeMaster.service.MaterialMasterIpml;



@RestController
@RequestMapping("/materialMaster")

public class MaterialMasterController {
	
	
	@Autowired
	private MaterialMasterIpml   ser;
	
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
	
	

}
