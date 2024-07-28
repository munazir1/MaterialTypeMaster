package in.co.greenwave.materialTypeMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;

@Repository

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Long> {
	
	
	
	@Query(value="SELECT   sapcode,b.material_name  FROM [Filter_PI].[dbo].[material_type_master] a inner join [Filter_PI].[dbo].material_master b on  a.id=b.id " , nativeQuery = true)
	public List<Object> getwholeData( ) ;
	/*
	 * @Query(value="",nativeQuery = true)
	 * 
	 * public String saveMaterialMAster() ;
	 * 
	 */
	// ;
	
	
	
}
