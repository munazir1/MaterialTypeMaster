package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;

public interface MaterialVendorMasterService {

	
	public List<MaterialVendorMaster> getMaterialVendorMaster();

	public void  saveMaterialVendorMaster(MaterialVendorMaster vendorS);

	public void updateMaterialVendorMaster(MaterialVendorMaster materialVendorMaster);
}
