package in.co.greenwave.materialTypeMaster.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialMasterRepository;


@Service
public  class MaterialMasterServiceImpl  implements MaterialMasterService{
	
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

	@Override
	public ResponseEntity<?>  saveMaterialMaster(MaterialMaster master) {
		List<MaterialMaster> all = repo.findAll();
		for (MaterialMaster materialMaster : all) {
			if(materialMaster.getActive( )==0&&  materialMaster.getSapCode().equalsIgnoreCase(master.getSapCode()) ) {
			repo.save(master);
			return  ResponseEntity.status(HttpStatus.CONFLICT).body("sapCode with "+master.getSapCode()+" already exist");
			}
			//DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-mm-hh hh:mm:ss");
			 master.setEntryTime(LocalDateTime.now());
			repo.save(master);
			}
		return  ResponseEntity.status(HttpStatus.CREATED).body("Masterial Details Saved");}
	
	
}

	
