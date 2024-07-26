package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialMasterRepository;


@Service
public class MaterialMasterService  implements MaterialMasterIpml{
	
	@Autowired
	private MaterialMasterRepository  repo;

	@Override
	public List<MaterialMaster>  getdata() {
		List<MaterialMaster> all = repo.findAll();
		return all;
	}

	@Override
	public List<Object> getMasteData() {
		List<Object> getwholeData = repo.getwholeData();
		
		return getwholeData;
	}
	
	

}
