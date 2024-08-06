/**
 * 
 */
package in.co.greenwave.materialTypeMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;


@Repository
public interface MaterialVendorMasterRepo extends JpaRepository<MaterialVendorMaster, Long> {

	@Query(value ="SELECT * FROM [Filter_PI].[dbo].[material_vendor_master]  where active=1" ,nativeQuery = true)
	public List<MaterialVendorMaster>  getMaterialvendorMaster();
}
