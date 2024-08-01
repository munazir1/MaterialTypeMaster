/**
 * 
 */
package in.co.greenwave.materialTypeMaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.entity.MaterialVendorMaster;


@Repository
public interface MaterialVendorMasterRepo extends JpaRepository<MaterialVendorMaster, Long> {

}
