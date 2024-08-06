package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;
import in.co.greenwave.materialTypeMaster.repository.MaterialVendorMasterRepo;

@Service
public class MaterialVendorMasterServiceImpl implements MaterialVendorMasterService {
	
	
	@Autowired
	 private MaterialVendorMasterRepo  materialVendorMasterRepo  ;

	
	@Override
	public List<MaterialVendorMaster> getMaterialVendorMaster() {
		List<MaterialVendorMaster> all = materialVendorMasterRepo.findAll();
		
		return all;
	}
	
	
	
	@Override
	public void saveMaterialVendorMaster(MaterialVendorMaster  vendorS){
		materialVendorMasterRepo.save(vendorS);
	}



	@Override
	public void updateMaterialVendorMaster(MaterialVendorMaster materialVendorMaster) {
		// TODO Auto-generated method stub
		
	}

	
	
	/*
	 * @Override public void updateMaterialVendorMaster(MaterialVendorMaster
	 * materialVendorMaster) {
	 * materialVendorMasterRepo.findAll().stream().anyMatch(i->i.getActive()==1). }
	 */

	/*@Override
	public void updateMaterialVendorMaster(MaterialVendorMaster materialVendorMaster) {
		String materialSAPCode = materialVendorMaster.getMaterialSAPCode();
		
		for(materialSAPCode) {
			materialVendorMasterRepo			}
		*/
	
 
}
