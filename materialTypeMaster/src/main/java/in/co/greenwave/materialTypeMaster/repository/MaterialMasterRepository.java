package in.co.greenwave.materialTypeMaster.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.dao.MasterData;
import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.SqlResultSetMappings;

@Repository

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Long> {
	
	
	
	@Query(value="SELECT sapcode,b.material_name,a.user_id  FROM [Filter_PI].[dbo].[material_type_master] a inner join [Filter_PI].[dbo].material_master b on  a.id=b.id " , nativeQuery = true)
	public List<Object> getwholeData( ) ;
	/*
	 * @Query(value="",nativeQuery = true)
	 * 
	 * public String saveMaterialMAster() ;
	 * 
	 */
	
	
}
