package in.co.greenwave.materialTypeMaster.service;

import java.util.List;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;

public interface MaterialMasterService {
	
	public List<MaterialMaster>   getdata();
	
	public List<Object>  getMasteData();
	public void saveMaterialMaster(MaterialMaster master);

}
