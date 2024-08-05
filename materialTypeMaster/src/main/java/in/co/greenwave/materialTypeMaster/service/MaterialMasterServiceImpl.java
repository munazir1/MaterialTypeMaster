package in.co.greenwave.materialTypeMaster.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.co.greenwave.materialTypeMaster.dto.MaterialMasterDto;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialMasterRepository;
import in.co.greenwave.materialTypeMaster.repository.MaterialTypeMasterRepository;

@Service
public class MaterialMasterServiceImpl implements MaterialMasterService {

	@Autowired
	private MaterialMasterRepository repo;

	@Autowired
	private MaterialTypeMasterRepository materialTypeMasterRepository;

	@Override
	public List<MaterialMaster> getdata() {
		List<MaterialMaster> all = repo.findAll();
		List<MaterialMaster> ACtiveMaterials = all.stream().filter(materialMaster -> materialMaster.getActive() == 1).collect(Collectors.toList());
		System.out.println("getDetails of materilas"+all);
		return ACtiveMaterials;
	}

	@Override
	public List<Object> getMaterialName() {
		List<Object> getwholeData = repo.getMaterialData();
		return getwholeData;
	}
	

	@Override
	public ResponseEntity<?> saveMaterialMaster(MaterialMaster master) {
		      boolean exists = repo.findAll().stream()
			        .anyMatch(materialMaster -> materialMaster.getActive() == 1 
			            && materialMaster.getSapCode().equalsIgnoreCase(master.getSapCode()));
			    if (exists) {
			        return ResponseEntity.status(HttpStatus.CONFLICT).body("sapCode with " + master.getSapCode() + " already exists");
			    }
			    // Set entry time and save the new material
			    master.setEntryTime(LocalDateTime.now());
			    master.setActive(1);
			    repo.save(master);
			    return ResponseEntity.status(HttpStatus.CREATED).body("Material Details Saved");
			}
	
	
	
	
	@Override
	public ResponseEntity<?> insertMaterialMaster(MaterialMaster materialMaster) {
		List<MaterialMaster> all = repo.findAll();
		for (MaterialMaster materialMaster2 : all) {
			System.out.println("materialMaster2"+materialMaster2);
			System.out.println("active"+materialMaster.getActive());
			
			if(materialMaster2.getSapCode().equalsIgnoreCase(materialMaster.getSapCode())) {
				System.out.println("equal++++++++++");
				if(materialMaster2.getActive()==1) {
					System.out.println("active 1"+materialMaster2.getActive());
				materialMaster2.setActive(0);
				materialMaster2.setUpdateTime(LocalDateTime.now());
				materialMaster2.setUpdateTime(LocalDateTime.now());
				repo.save(materialMaster2);
			}
				
				else if (materialMaster2.getActive() == 0){
					 System.out.println("materialMaster2.getActive()"+materialMaster2.getActive());
					System.out.println("active -1"+materialMaster2);
					materialMaster2.setActive(materialMaster2.getActive()-1);
					materialMaster2.setUpdateTime(LocalDateTime.now());
					repo.save(materialMaster2);
				}
				
			 else if (materialMaster2.getActive()<0) {
				System.out.println(materialMaster2.getActive());
	            System.out.println("active less than 0"+materialMaster2);
	            materialMaster2.setActive(materialMaster2.getActive() - 1);
	           // materialMaster2.setUpdateTime(LocalDateTime.now());
	            repo.save(materialMaster2);
	        }}
			}
		return ResponseEntity.ok(" Material  Updated ");
	}

	/*
	 * @Override public ResponseEntity<?> insertMaterialMaster() {
	 * 
	 * return null; }
	 */

	}
