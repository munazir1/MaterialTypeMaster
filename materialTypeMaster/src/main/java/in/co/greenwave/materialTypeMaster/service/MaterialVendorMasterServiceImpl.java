package in.co.greenwave.materialTypeMaster.service;
  import in.co.greenwave.materialTypeMaster.service.MaterialVendorMasterServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import in.co.greenwave.materialTypeMaster.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialVendorMasterRepo;



@Service
public class MaterialVendorMasterServiceImpl implements MaterialVendorMasterService {
	
	
	@Autowired
	 private MaterialVendorMasterRepo  materialVendorMasterRepo  ;

	
	@Override
	public List<MaterialVendorMaster> getMaterialVendorMaster() {
		List<MaterialVendorMaster> all = materialVendorMasterRepo.getMaterialvendorMaster();
	
		
		return all;
	}
	
	
	
	@Override
	public void saveMaterialVendorMaster(MaterialVendorMaster  vendorS){
		materialVendorMasterRepo.save(vendorS);
	}
	



	@Override
	public ResponseEntity<?> updateMaterialVendorMaster(MaterialVendorMaster materialVendorMaster) {
		List<MaterialVendorMaster> all = materialVendorMasterRepo.findAll();
		for (MaterialVendorMaster materialVendorMaster2 : all) {
            System.out.println("materialVendorMaster2materia+++++++++++++" + materialVendorMaster2);
            if (materialVendorMaster2.getVendorCode().equalsIgnoreCase(materialVendorMaster.getVendorCode())
                    && materialVendorMaster2.getMaterialSAPCode().equalsIgnoreCase(materialVendorMaster.getMaterialSAPCode())) {
                System.out.println("materialVendorMaster2" + materialVendorMaster2);
                if (materialVendorMaster2.getActive() == 1) {
                    System.out.println("getActive()==1");
                    materialVendorMaster2.setActive(0);
                    materialVendorMaster2.setUpdateTime(LocalDateTime.now());
                    materialVendorMasterRepo.save(materialVendorMaster2);
                    return ResponseEntity.status(HttpStatus.OK).body("Material Vendor Master deactivated successfully."+materialVendorMaster2.getVendorCode());
                } else if (materialVendorMaster2.getActive() == 0) {
                    System.out.println("getActive()==0");
                    materialVendorMaster2.setActive(-1);
                    materialVendorMaster2.setUpdateTime(LocalDateTime.now());
                    materialVendorMasterRepo.save(materialVendorMaster2);
                    return ResponseEntity.status(HttpStatus.OK).body("Material Vendor Master"+materialVendorMaster2.getVendorCode());
                } else if (materialVendorMaster2.getActive() < 0) {
                    System.out.println("getActive()<0");
                    materialVendorMaster2.setActive(materialVendorMaster2.getActive() - 1);
                    materialVendorMaster2.setUpdateTime(LocalDateTime.now());
                    materialVendorMasterRepo.save(materialVendorMaster2);
                    return ResponseEntity.status(HttpStatus.OK).body("Material Vendor Master marked for further deletion."+materialVendorMaster2.getVendorCode());
                }
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Material Vendor Master not found."+materialVendorMaster.getVendorCode());
    }

}

	
	

	
 

